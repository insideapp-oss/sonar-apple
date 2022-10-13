package fr.insideapp.sonarqube.apple.commons.result.models.tests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ValueDeserializer;

public class ActionTestMetadata {
    @JsonProperty("testStatus")
    @JsonDeserialize(using = ValueDeserializer.class)
    public String status;

}