package fr.insideapp.sonarqube.swift.issues.periphery.models;

import com.fasterxml.jackson.databind.util.StdConverter;
import fr.insideapp.sonarqube.swift.issues.periphery.PeripherySensor;
import org.apache.commons.lang3.StringUtils;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeripheryIssueLocationConverter extends StdConverter<String, PeripheryIssueLocation> {

    private static final Logger LOGGER = Loggers.get(PeripheryIssueLocationConverter.class);

    private final static String SEPARATOR = ":";

    @Override
    public PeripheryIssueLocation convert(String value) {
        try {
            String[] components = StringUtils.splitByWholeSeparator(value, SEPARATOR);
            String filePath = components[0];
            Integer lineNum = Integer.valueOf(components[1]);
            return new PeripheryIssueLocation(filePath, lineNum);
        } catch (Exception e) {
            LOGGER.error("An exception occurred when parsing Periphery issue location.");
            LOGGER.debug("{}", e);
            return null;
        }
    }
}