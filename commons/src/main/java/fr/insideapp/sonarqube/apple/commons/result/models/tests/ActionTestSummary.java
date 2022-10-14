package fr.insideapp.sonarqube.apple.commons.result.models.tests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ValueDeserializer;

public abstract class ActionTestSummary {

    @JsonProperty("name")
    @JsonDeserialize(using = ValueDeserializer.class)
    public String name;

}
