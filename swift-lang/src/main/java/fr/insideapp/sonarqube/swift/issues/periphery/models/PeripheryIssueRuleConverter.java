package fr.insideapp.sonarqube.swift.issues.periphery.models;

import com.fasterxml.jackson.databind.util.StdConverter;

public class PeripheryIssueRuleConverter extends StdConverter<String[], String> {

    @Override
    public String convert(String[] value) {
        // there is only one rule at the moment
        return value[0];
    }
}
