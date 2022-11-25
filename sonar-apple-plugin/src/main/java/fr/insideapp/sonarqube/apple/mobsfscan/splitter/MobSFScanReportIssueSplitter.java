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
        Map<MobSFScanRulesDefinition, List<ReportIssue>> map = new HashMap() {{
            mobSFScanRulesDefinitions.forEach(def -> {
                put(def, new ArrayList<>());
            });
        }};
        Map<MobSFScanRulesDefinition, List<String>> activeRules = new HashMap() {{
            mobSFScanRulesDefinitions.forEach(def -> {
                List<String> rulesForRepo = rules.findByRepository(def.repositoryKey).stream()
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
                        if (Arrays.stream(entry.getKey().language.getFileSuffixes()).anyMatch(e -> e.equalsIgnoreCase(FilenameUtils.getExtension(issue.getFilePath())))) {
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
