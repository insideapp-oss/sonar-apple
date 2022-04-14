package fr.insideapp.sonarqube.swift.lang.issues;

import fr.insideapp.sonarqube.swift.lang.Swift;
import fr.insideapp.sonarqube.swift.lang.issues.swiftlint.SwiftLintRulesDefinition;
import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;

public class SwiftProfile implements BuiltInQualityProfilesDefinition {

    public static final String PROFILE_PATH = "fr/insideapp/sonarqube/swift/swiftlint/profile.xml";

    @Override
    public void define(Context context) {

        NewBuiltInQualityProfile nbiqp = context.createBuiltInQualityProfile("Swift", Swift.KEY);
        XmlProfileParser.parse(PROFILE_PATH, nbiqp);
        nbiqp.setDefault(true);
        nbiqp.done();
    }
}
