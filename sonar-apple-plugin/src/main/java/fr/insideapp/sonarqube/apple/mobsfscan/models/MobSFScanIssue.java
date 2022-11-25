package fr.insideapp.sonarqube.apple.mobsfscan.models;

import java.util.List;
import java.util.Map;

public final class MobSFScanIssue {

    public final String rule;

    public final String description;

    public final List<MobSFScanReportResultLocation> locations;

    public MobSFScanIssue(Map.Entry<String, MobSFScanReportResult> entry) {
        this.rule = entry.getKey();
        this.description = entry.getValue().description;
        this.locations = entry.getValue().locations;
    }

    public MobSFScanIssue(
            final String rule,
            final String description,
            final List<MobSFScanReportResultLocation> locations
    ) {
        this.rule = rule;
        this.description = description;
        this.locations = locations;
    }

}