package fr.insideapp.sonarqube.apple.commons.result.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.insideapp.sonarqube.apple.commons.result.deserializer.ValuesDeserializer;

import java.util.List;

public class Issue {

    @JsonProperty("warningSummaries")
    @JsonDeserialize(using = ValuesDeserializer.class)
    public List<WarningSummary> warnings;

}