package fr.insideapp.sonarqube.apple.mobsfscan.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public final class MobSFScanReportResultLocation {

    @JsonProperty("file_path")
    public String path;

    @JsonProperty("match_lines")
    public List<Integer> lines;

}
