package fr.insideapp.sonarqube.apple.commons.result.models.tests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ValueDeserializer;

public abstract class ActionTest {

    public enum Type {
        @JsonProperty("ActionTestSummaryGroup")
        GROUP,
        @JsonProperty("ActionTestMetadata")
        METADATA,
    }

    @JsonProperty("name")
    @JsonDeserialize(using = ValueDeserializer.class)
    String name;

    @JsonProperty("duration")
    @JsonDeserialize(using = ValueDeserializer.class)
    public Double duration;

}
