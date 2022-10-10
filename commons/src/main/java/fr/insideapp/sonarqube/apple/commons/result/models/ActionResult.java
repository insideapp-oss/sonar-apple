package fr.insideapp.sonarqube.apple.commons.result.models;

import com.fasterxml.jackson.annotation.JsonProperty;
public class ActionResult {

    @JsonProperty("testsRef")
    public TestsReference testsRef;

}