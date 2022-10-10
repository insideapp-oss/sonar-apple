package fr.insideapp.sonarqube.apple.commons.result.models.tests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ValueDeserializer;

public class ActionTestCase extends ActionTest {

    public enum Status {
        @JsonProperty("Success")
        SUCCESS,
        @JsonProperty("Failure")
        FAILURE,
        @JsonProperty("Skipped")
        SKIPPED,
        @JsonProperty("Mixed")
        MIXED
    }

    @JsonProperty("testStatus")
    @JsonDeserialize(using = ValueDeserializer.class)
    public Status status;

}
