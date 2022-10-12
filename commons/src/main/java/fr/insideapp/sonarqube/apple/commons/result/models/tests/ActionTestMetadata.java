package fr.insideapp.sonarqube.apple.commons.result.models.tests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ValueDeserializer;

public class ActionTestMetadata {

    @JsonProperty("name")
    @JsonDeserialize(using = ValueDeserializer.class)
    public String name;

    @JsonProperty("duration")
    @JsonDeserialize(using = ValueDeserializer.class)
    public Double duration;

    @JsonProperty("testStatus")
    @JsonDeserialize(using = ValueDeserializer.class)
    public String status;

}
