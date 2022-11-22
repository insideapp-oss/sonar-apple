package fr.insideapp.sonarqube.swift.issues.periphery.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public final class PeripheryIssue {

    @JsonProperty("location")
    @JsonDeserialize(converter = PeripheryIssueLocationConverter.class)
    public PeripheryIssueLocation location;

    @JsonProperty("hints")
    @JsonDeserialize(converter = PeripheryIssueRuleConverter.class)
    public String ruleIdentifier;

}