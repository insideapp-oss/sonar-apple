/*
 * SonarQube Apple Plugin - Enables analysis of Swift and Objective-C projects into SonarQube.
 * Copyright © 2022 inside|app (contact@insideapp.fr)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.insideapp.sonarqube.apple.commons.issues;

import fr.insideapp.sonarqube.apple.commons.rules.JSONRulesDefinition;
import org.apache.commons.io.FilenameUtils;
import org.sonar.api.batch.rule.ActiveRule;
import org.sonar.api.batch.rule.ActiveRules;
import org.sonar.api.rule.RuleKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class ReportIssueSplitter<T extends JSONRulesDefinition> implements ReportIssueSplittable<T> {

    private final List<T> rulesDefinitions;

    protected ReportIssueSplitter(
        final List<T> rulesDefinitions
    ) {
        this.rulesDefinitions = rulesDefinitions;
    }

    @Override
    public Map<T, List<ReportIssue>> split(List<ReportIssue> issues, ActiveRules rules) {
        Map<T, List<ReportIssue>> map = new HashMap<>();
        rulesDefinitions.forEach(def -> map.put(def, new ArrayList<>()));
        Map<T, List<String>> activeRules = new HashMap<>();
        rulesDefinitions.forEach(def -> {
            List<String> rulesForRepo = rules.findByRepository(def.getRepositoryKey()).stream()
                .map(ActiveRule::ruleKey)
                .map(RuleKey::rule)
                .collect(Collectors.toList());
            activeRules.put(def, rulesForRepo);
        });
        for (ReportIssue issue : issues) {
            for (Map.Entry<T, List<String>> entry : activeRules.entrySet()) {
                if (shouldAddIssue(issue, entry)) {
                    // update corresponding map entry
                    addIssue(issue, map, entry.getKey());
                    // skipping
                    break;
                }
            }
        }
        return map;
    }

    private boolean shouldAddIssue(ReportIssue issue, Map.Entry<T, List<String>> activeRule) {
        boolean shouldAdd = false;
        // the issue rule key is in the repository
        if (activeRule.getValue().contains(issue.getRuleId())) {
            // the issue is on a file
            if (issue.getFilePath() != null) {
                // making sure the file extensions match the language of the repository
                // if not, we do nothing (hence the nested if)
                final String[] extensions = activeRule.getKey().getLanguage().getFileSuffixes();
                shouldAdd = FilenameUtils.isExtension(issue.getFilePath(), extensions);
                // issue is not on a file
            } else {
                shouldAdd = true;
            }
        }
        return shouldAdd;
    }

    private void addIssue(ReportIssue issue, Map<T, List<ReportIssue>> map, T key) {
        List<ReportIssue> issues = map.get(key);
        issues.add(issue);
        map.put(key, issues);
    }

}
