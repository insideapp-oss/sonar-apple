package fr.insideapp.sonarqube.apple.mobsfscan.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.List;

public final class MobSFScanReportResult {

    @JsonProperty("metadata")
    @JsonDeserialize(using = MobSFScanReportResultDescriptionDeserializer.class)
    public String description;

    @JsonSetter(value = "files", nulls = Nulls.SKIP)
    public List<MobSFScanReportResultLocation> locations = new ArrayList<>();

}
