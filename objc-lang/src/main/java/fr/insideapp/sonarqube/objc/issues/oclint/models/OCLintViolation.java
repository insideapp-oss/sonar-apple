package fr.insideapp.sonarqube.objc.issues.oclint.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class OCLintViolation {

    @JsonProperty("path")
    public String path;

    @JsonProperty("startLine")
    public int line;

    @JsonProperty("rule")
    @JsonDeserialize(converter = OCLintRuleNameConverter.class)
    public String rule;

    @JsonProperty("message")
    public String message;

}