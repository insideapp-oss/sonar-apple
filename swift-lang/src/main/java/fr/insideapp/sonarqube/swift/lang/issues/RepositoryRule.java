package fr.insideapp.sonarqube.swift.lang.issues;

public class RepositoryRule {

    private final String key;
    private final String name;
    private final String severity;
    private final String description;
    private final String type;
    private final RepositoryRuleDebt debt;

    public RepositoryRule(final String key, final String name, final String severity, final String description, final String type, final RepositoryRuleDebt debt) {
        this.key = key;
        this.name = name;
        this.severity = severity;
        this.description = description;
        this.type = type;
        this.debt = debt;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getSeverity() {
        return severity;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public RepositoryRuleDebt getDebt() {
        return debt;
    }
}
