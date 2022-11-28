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
package fr.insideapp.sonarqube.apple.mobsfscan.splitter;

import fr.insideapp.sonarqube.apple.commons.issues.MobSFScanRulesDefinition;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import org.apache.commons.io.FilenameUtils;
import org.sonar.api.batch.rule.ActiveRule;
import org.sonar.api.batch.rule.ActiveRules;
import org.sonar.api.rule.RuleKey;
import org.sonar.api.scanner.ScannerSide;

import java.util.*;
import java.util.stream.Collectors;

@ScannerSide
public class MobSFScanReportIssueSplitter implements MobSFScanReportIssueSplittable {

    private final List<MobSFScanRulesDefinition> mobSFScanRulesDefinitions;

    public MobSFScanReportIssueSplitter(
            final List<MobSFScanRulesDefinition> mobSFScanRulesDefinitions
    ) {
        this.mobSFScanRulesDefinitions = mobSFScanRulesDefinitions;
    }

    @Override
    public Map<MobSFScanRulesDefinition, List<ReportIssue>> split(List<ReportIssue> issues, ActiveRules rules) {
        Map<MobSFScanRulesDefinition, List<ReportIssue>> map = new HashMap<>() {{
            mobSFScanRulesDefinitions.forEach(def -> put(def, new ArrayList<>()));
        }};
        Map<MobSFScanRulesDefinition, List<String>> activeRules = new HashMap<>() {{
            mobSFScanRulesDefinitions.forEach(def -> {
                List<String> rulesForRepo = rules.findByRepository(def.getRepositoryKey()).stream()
                        .map(ActiveRule::ruleKey)
                        .map(RuleKey::rule)
                        .collect(Collectors.toList());
                put(def, rulesForRepo);
            });
        }};

        for (ReportIssue issue : issues) {
            String ruleId = issue.getRuleId();

            for (Map.Entry<MobSFScanRulesDefinition, List<String>> entry : activeRules.entrySet()) {
                // the issue rule key is in the repository
                if (entry.getValue().contains(ruleId)) {
                    // the issue is on a file
                    if (issue.getFilePath() != null) {
                        // making sure the file extensions match the language of the repository
                        // if not, we do nothing (hence the nested if)
                        final String[] extensions = entry.getKey().getLanguage().getFileSuffixes();
                        if (FilenameUtils.isExtension(issue.getFilePath(), extensions)) {
                            // update corresponding map entry
                            addIssue(map, entry.getKey(), issue);
                            // skipping
                            break;
                        }
                    // issue is not on a file
                    } else {
                        // update corresponding map entry
                        addIssue(map, entry.getKey(), issue);
                        // skipping
                        break;
                    }

                }
            }
        }

        return map;
    }

    private static void addIssue(Map<MobSFScanRulesDefinition, List<ReportIssue>> map, MobSFScanRulesDefinition key, ReportIssue issue) {
        List<ReportIssue> issues = map.get(key);
        issues.add(issue);
        map.put(key, issues);
    }

}
