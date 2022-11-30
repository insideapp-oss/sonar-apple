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
package fr.insideapp.sonarqube.objc.issues.oclint;

import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.objc.issues.oclint.implementations.OCLintExtractor;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultFileSystem;
import org.sonar.api.config.internal.MapSettings;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class OCLintExtractorTest {

    private OCLintExtractor extractor;

    @Before
    public void prepare() {
        MapSettings settings = new MapSettings();
        settings.setProperty("sonar.sources", "folder");
        DefaultFileSystem fileSystem = new DefaultFileSystem(new File("/oclint/extractor"));
        extractor = new OCLintExtractor(new ObjectiveC(), settings.asConfig(), fileSystem);
    }

    @Test
    public void buildSourceArguments() {
        List<String> arguments = Arrays.asList(extractor.buildSourceArguments());
        assertThat(arguments).hasSize(2);
        assertThat(arguments).element(0).isEqualTo("--include");
        assertThat(arguments).element(1).isEqualTo("/oclint/extractor/folder/.*\\.(h|m|mm)");
    }

}
