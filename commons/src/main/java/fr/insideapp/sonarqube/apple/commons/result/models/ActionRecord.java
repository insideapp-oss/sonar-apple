package fr.insideapp.sonarqube.apple.commons.result.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActionRecord {

    @JsonProperty("actionResult")
    public ActionResult result;

}
