package fr.insideapp.sonarqube.apple.commons.issues;

public abstract class MobSFScanRulesDefinition extends JSONRulesDefinition {

    public static final String REPOSITORY_KEY = "MobSFScan";
    public static final String REPOSITORY_NAME = REPOSITORY_KEY;
    public static final String RULES_PATH = "/mobsfscan-rules.json";

    public MobSFScanRulesDefinition(String language) {
        super(REPOSITORY_KEY, REPOSITORY_NAME, language, RULES_PATH);
    }

}
