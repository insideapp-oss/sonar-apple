package fr.insideapp.sonarqube.swift.lang.issues.periphery;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportParser;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeripheryReportParser implements ReportParser {

    @Override
    public List<ReportIssue> parse(String input) {

        List<ReportIssue> issues = new ArrayList<>();

        String[] lines = input.split(System.getProperty("line.separator"));
        Pattern pattern = Pattern.compile("(.*.swift):(\\w+):(\\w+): (warning): (.*)");
        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                String filePath = matcher.group(1);
                int lineNum = Integer.parseInt(matcher.group(2));
                String message = matcher.group(5);
                /*
                 Periphery doesn't provide the ruleId at the moment
                 TODO: add ruleId when it will be provided
                */
                String ruleId = "unused";
                issues.add(new ReportIssue(ruleId, message, filePath, lineNum));
            }
        }

        return issues;
    }
}
