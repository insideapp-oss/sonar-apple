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

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import fr.insideapp.sonarqube.apple.xcode.legacy.XcodeResultLegacyRunner;
import fr.insideapp.sonarqube.apple.xcode.runner.XcodeResultReadObjectRunner;
import fr.insideapp.sonarqube.apple.xcode.parser.XcodeActionRecordParser;
import fr.insideapp.sonarqube.apple.xcode.runner.XcodeResultReadRunner;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.config.Configuration;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;
import org.sonar.api.scanner.ScannerSide;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@ScannerSide
public class XcodeResultExtensionProvider implements ExtensionProvider {

    private static final String RESULT_BUNDLE_PATH_KEY = "sonar.apple.resultBundlePath";
    private static final String DEFAULT_RESULT_BUNDLE_PATH = "build/result.xcresult";
    private static final PropertyDefinition RESULT_BUNDLE_PROPERTY = PropertyDefinition
            .builder(RESULT_BUNDLE_PATH_KEY)
            .name("Xcode Result Bundle path")
            .description("Path to Xcode Result Bundle file. The path is relative to the project base directory.")
            .defaultValue(DEFAULT_RESULT_BUNDLE_PATH)
            .onQualifiers(Qualifiers.PROJECT)
            .category(APPLE_CATEGORY)
            .build();

    public List<Object> extensions() {
        return Arrays.asList(
                RESULT_BUNDLE_PROPERTY,
                XcodeResultReadRunner.class,
                XcodeActionRecordParser.class,
                XcodeResultReadObjectRunner.class,
                XcodeResultLegacyRunner.class
        );
    }

    public String resultBundlePath(Configuration configuration) {
        return configuration
                .get(RESULT_BUNDLE_PATH_KEY)
                .orElse(DEFAULT_RESULT_BUNDLE_PATH);
    }

    public File resultBundle(FileSystem fileSystem, Configuration configuration) {
        return new File(fileSystem.baseDir(), resultBundlePath(configuration));
    }

}
