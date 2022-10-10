package fr.insideapp.sonarqube.apple.commons.result.models.tests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ValueDeserializer;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ValuesDeserializer;

import java.util.List;

public class ActionTestableSummary {

    @JsonProperty("name")
    @JsonDeserialize(using = ValueDeserializer.class)
    public String name;

    @JsonProperty("tests")
    @JsonDeserialize(using = ValuesDeserializer.class)
    public List<ActionTestGroup> tests;

}
