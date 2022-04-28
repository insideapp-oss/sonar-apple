package fr.insideapp.sonarqube.apple.commons.issues;

import org.apache.commons.lang3.StringUtils;

public abstract class MobSFScanRulesDefinition extends JSONRulesDefinition {

    private static String REPOSITORY_KEY = "MobSFScan";
    public static final String RULES_PATH = "/mobsfscan-rules.json";

    public MobSFScanRulesDefinition(String language) {
        super(builder(language), builder(language), language, RULES_PATH);
    }

    public static String builder(String language) {
        return REPOSITORY_KEY + StringUtils.capitalize(language);
    }

}
