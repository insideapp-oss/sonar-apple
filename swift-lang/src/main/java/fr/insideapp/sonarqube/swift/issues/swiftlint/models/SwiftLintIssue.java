package fr.insideapp.sonarqube.swift.issues.swiftlint.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class SwiftLintIssue {

    @JsonProperty("rule_id")
    public String ruleIdentifier;

    @JsonProperty("reason")
    public String message;

    @JsonProperty("file")
    public String filePath;

    @JsonProperty("line")
    public Integer lineNumber;

    @JsonProperty("character")
    public Integer characterNumber;

}
