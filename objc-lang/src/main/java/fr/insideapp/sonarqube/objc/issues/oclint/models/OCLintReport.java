package fr.insideapp.sonarqube.objc.issues.oclint.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OCLintReport {

    @JsonProperty("violation")
    public OCLintViolation[] violations;

}

