package fr.insideapp.sonarqube.apple.commons.result.models.tests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ValuesDeserializer;

import java.util.ArrayList;

public class ActionTestPlanRunSummaries {
    @JsonProperty("summaries")
    @JsonDeserialize(using = ValuesDeserializer.class)
    public ArrayList<ActionTestPlanRunSummary> summaries;

}
