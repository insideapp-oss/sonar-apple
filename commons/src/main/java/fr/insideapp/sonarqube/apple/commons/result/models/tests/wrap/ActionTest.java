package fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class ActionTest {

    public enum Type {
        @JsonProperty("ActionTestSummaryGroup")
        GROUP,
        @JsonProperty("ActionTestMetadata")
        METADATA,
    }

    abstract public Type getType();

}

