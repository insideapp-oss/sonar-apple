package fr.insideapp.sonarqube.apple.mobsfscan.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public final class MobSFScanReport {

    @JsonProperty("results")
    public Map<String, MobSFScanReportResult> results;

}
