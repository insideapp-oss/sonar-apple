package fr.insideapp.sonarqube.swift.lang.issues;

public class RepositoryRuleDebt {

    private final String function;
    private final String offset;

    public RepositoryRuleDebt(final String function, final String offset) {
        this.function = function;
        this.offset = offset;
    }

    public String getFunction() {
        return function;
    }

    public String getOffset() {
        return offset;
    }
}
