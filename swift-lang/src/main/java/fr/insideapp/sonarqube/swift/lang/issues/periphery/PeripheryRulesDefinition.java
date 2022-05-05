package fr.insideapp.sonarqube.swift.lang.issues.periphery;

import fr.insideapp.sonarqube.apple.commons.issues.JSONRulesDefinition;
import fr.insideapp.sonarqube.swift.lang.Swift;

public class PeripheryRulesDefinition extends JSONRulesDefinition {

    public static final String REPOSITORY_KEY = "Periphery";
    public static final String REPOSITORY_NAME = REPOSITORY_KEY;

    public static final String RULES_PATH = "/periphery-rules.json";

    public PeripheryRulesDefinition() {
        super(REPOSITORY_KEY, REPOSITORY_NAME, Swift.KEY, RULES_PATH);
    }

}
