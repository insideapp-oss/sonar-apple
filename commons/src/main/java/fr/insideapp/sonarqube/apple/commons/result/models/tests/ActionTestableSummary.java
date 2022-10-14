package fr.insideapp.sonarqube.apple.commons.result.models.tests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ActionTestDeserializer;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ValueDeserializer;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ValuesDeserializer;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTest;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTestGroup;

public class ActionTestableSummary extends ActionTestSummary {

    @JsonProperty("tests")
    @JsonDeserialize(using = ActionTestDeserializer.class)
    public ActionTestGroup tests;
}

