package fr.insideapp.sonarqube.swift.issues.periphery.models;

public final class PeripheryIssueLocation {

    public final String path;

    public final Integer line;

    PeripheryIssueLocation(String path, Integer line) {
        this.path = path;
        this.line = line;
    }
}