/*
 * SonarQube Apple Plugin - Enables analysis of Swift and Objective-C projects into SonarQube.
 * Copyright © 2022 inside|app (contact@insideapp.fr)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.insideapp.sonaqube.apple;

import fr.insideapp.sonarqube.apple.commons.TestFileFinders;
import fr.insideapp.sonarqube.apple.commons.coverage.AppleCoverageSensor;
import fr.insideapp.sonarqube.apple.commons.tests.AppleTestsSensor;
import fr.insideapp.sonarqube.objc.lang.ObjectiveC;
import fr.insideapp.sonarqube.objc.lang.ObjectiveCSensor;
import fr.insideapp.sonarqube.objc.lang.issues.ObjectiveCProfile;
import fr.insideapp.sonarqube.objc.lang.issues.oclint.OCLintRulesDefinition;
import fr.insideapp.sonarqube.objc.lang.issues.oclint.OCLintSensor;
import fr.insideapp.sonarqube.objc.lang.tests.ObjectiveCTestFileFinder;
import fr.insideapp.sonarqube.swift.lang.Swift;
import fr.insideapp.sonarqube.swift.lang.SwiftSensor;
import fr.insideapp.sonarqube.swift.lang.issues.SwiftProfile;
import fr.insideapp.sonarqube.swift.lang.issues.swiftlint.SwiftLintRulesDefinition;
import fr.insideapp.sonarqube.swift.lang.issues.swiftlint.SwiftLintSensor;
import fr.insideapp.sonarqube.swift.lang.tests.SwiftTestFileFinder;
import org.sonar.api.Plugin;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;

public class ApplePlugin implements Plugin {

    public static final String APPLE_CATEGORY = "Apple";

    public static final String TESTS_SUBCATEGORY = "Tests";

    public static final String COVERAGE_SUBCATEGORY = "Coverage";

    @Override
    public void define(Context context) {

        // Swift language support
        context.addExtensions(Swift.class, SwiftSensor.class , SwiftProfile.class);

        // SwiftLint
        context.addExtensions(SwiftLintSensor.class, SwiftLintRulesDefinition.class);

        // Objective-C language support
        context.addExtensions(ObjectiveC.class, ObjectiveCSensor.class, ObjectiveCProfile.class);

        // OCLint
        context.addExtensions(OCLintSensor.class, OCLintRulesDefinition.class);

        // Tests
        context.addExtension(
                PropertyDefinition.builder(AppleTestsSensor.REPORT_PATH_KEY)
                        .name("Unit Test Report")
                        .description("Path to Apple unit test execution report file. The path may be either absolute or relative to the project base directory.")
                        .onQualifiers(Qualifiers.PROJECT)
                        .category(APPLE_CATEGORY)
                        .subCategory(TESTS_SUBCATEGORY)
                        .build());

        TestFileFinders.getInstance().addFinder(new SwiftTestFileFinder());
        TestFileFinders.getInstance().addFinder(new ObjectiveCTestFileFinder());
        context.addExtension(AppleTestsSensor.class);

        // Coverage
        context.addExtension(
                PropertyDefinition.builder(AppleCoverageSensor.REPORT_PATH_KEY)
                        .name("Coverage Report")
                        .description("Path to Apple coverage report file. The path may be either absolute or relative to the project base directory.")
                        .onQualifiers(Qualifiers.PROJECT)
                        .category(APPLE_CATEGORY)
                        .subCategory(COVERAGE_SUBCATEGORY)
                        .build());

        context.addExtension(AppleCoverageSensor.class);
    }
}
