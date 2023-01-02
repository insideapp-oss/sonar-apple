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
package fr.insideapp.sonarqube.apple;

import fr.insideapp.sonarqube.apple.commons.ApplePluginExtensionProvider;
import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import fr.insideapp.sonarqube.apple.commons.SonarProjectConfiguration;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssueRecorder;
import fr.insideapp.sonarqube.apple.commons.tests.TestFileFinders;
import fr.insideapp.sonarqube.apple.commons.coverage.AppleCoverageSensor;
import fr.insideapp.sonarqube.apple.commons.result.AppleResultSensor;
import fr.insideapp.sonarqube.apple.commons.tests.AppleTestsSensor;
import fr.insideapp.sonarqube.apple.mobsfscan.MobSFScanExtensionProvider;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.objc.ObjectiveCSensor;
import fr.insideapp.sonarqube.objc.issues.ObjectiveCProfile;
import fr.insideapp.sonarqube.objc.issues.oclint.*;
import fr.insideapp.sonarqube.objc.tests.ObjectiveCTestFileFinder;
import fr.insideapp.sonarqube.swift.Swift;
import fr.insideapp.sonarqube.swift.SwiftSensor;
import fr.insideapp.sonarqube.swift.issues.SwiftProfile;
import fr.insideapp.sonarqube.swift.issues.periphery.PeripheryExtensionProvider;
import fr.insideapp.sonarqube.swift.issues.swiftlint.SwiftLintExtensionProvider;
import fr.insideapp.sonarqube.swift.tests.SwiftTestFileFinder;
import org.sonar.api.Plugin;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

public class ApplePlugin implements Plugin {

    private static final Logger LOGGER = Loggers.get(ApplePlugin.class);

    public static final String APPLE_CATEGORY = "Apple";

    @Override
    public void define(Context context) {

        // Project
        context.addExtension(SonarProjectConfiguration.class);

        // Swift language support
        context.addExtensions(Swift.class, SwiftSensor.class, SwiftProfile.class);

        // Objective-C language support
        context.addExtensions(ObjectiveC.class, ObjectiveCSensor.class, ObjectiveCProfile.class);

        // Issues reporter
        context.addExtension(ReportIssueRecorder.class);

        register(context,
                ApplePluginExtensionProvider.class,
                SwiftLintExtensionProvider.class, // SwiftLint
                PeripheryExtensionProvider.class, // Periphery
                MobSFScanExtensionProvider.class, // MobSFScan
                OCLintExtensionProvider.class  // OCLint
        );

        // Xcode result bundle
        context.addExtension(
                PropertyDefinition.builder(AppleResultSensor.RESULT_BUNDLE_PATH_KEY)
                        .name("Xcode result bundle")
                        .description("Path to Xcode result bundle file. The path is relative to the project base directory.")
                        .onQualifiers(Qualifiers.PROJECT)
                        .category(APPLE_CATEGORY)
                        .build());

        // Coverage
        context.addExtension(AppleCoverageSensor.class);

        // Tests
        TestFileFinders.getInstance().addFinder(new SwiftTestFileFinder());
        TestFileFinders.getInstance().addFinder(new ObjectiveCTestFileFinder());
        context.addExtension(AppleTestsSensor.class);

    }

    @SafeVarargs
    private void register(Context context, Class<? extends ExtensionProvider>... providersClazz) {
        for (Class<? extends ExtensionProvider> providerClazz : providersClazz) {
            try {
                // registering provider
                context.addExtension(providerClazz);
                // registering extensions
                ExtensionProvider provider = providerClazz.getDeclaredConstructor().newInstance();
                context.addExtensions(provider.extensions());
            } catch (Exception e) {
                LOGGER.info("An error occurred when trying to register '{}'", providerClazz.getCanonicalName());
                LOGGER.debug("Exception: {}", e);
            }
        }
    }
}