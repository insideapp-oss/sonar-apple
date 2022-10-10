package fr.insideapp.sonarqube.apple.commons.result.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ValueDeserializer;

public class TestsReference {

    @JsonProperty("id")
    @JsonDeserialize(using = ValueDeserializer.class)
    public String id;

}

