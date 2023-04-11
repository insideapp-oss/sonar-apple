package fr.insideapp.sonarqube.apple.commons.result.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ValueDeserializer;

public class WarningSummary {

    @JsonProperty("issueType")
    @JsonDeserialize(using = ValueDeserializer.class)
    public String type;

    @JsonProperty("documentLocationInCreatingWorkspace")
    public DocumentLocation location;

    @JsonProperty("message")
    @JsonDeserialize(using = ValueDeserializer.class)
    public String message;

}