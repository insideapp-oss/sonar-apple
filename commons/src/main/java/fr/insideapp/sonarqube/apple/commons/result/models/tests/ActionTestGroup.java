package fr.insideapp.sonarqube.apple.commons.result.models.tests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ActionTestDeserializer;

import java.util.List;

public class ActionTestGroup extends ActionTest {

    @JsonProperty("subtests")
    @JsonDeserialize(using = ActionTestDeserializer.class)
    public List<ActionTest> tests;

}

