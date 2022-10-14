package fr.insideapp.sonarqube.apple.commons.result.models.tests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ActionTestDeserializer;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ValueDeserializer;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTest;

public class ActionTestSummaryGroup extends ActionTestSummary {

    @JsonProperty("duration")
    @JsonDeserialize(using = ValueDeserializer.class)
    public Double duration;

    @JsonProperty("subtests")
    @JsonDeserialize(using = ActionTestDeserializer.class)
    public ActionTest tests;

}

