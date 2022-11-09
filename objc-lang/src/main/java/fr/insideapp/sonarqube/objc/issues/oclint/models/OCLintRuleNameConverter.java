package fr.insideapp.sonarqube.objc.issues.oclint.models;

import com.fasterxml.jackson.databind.util.StdConverter;

public class OCLintRuleNameConverter extends StdConverter<String, String> {

    @Override
    public String convert(String value) {
        return value.replace(" ", "-");
    }
}
