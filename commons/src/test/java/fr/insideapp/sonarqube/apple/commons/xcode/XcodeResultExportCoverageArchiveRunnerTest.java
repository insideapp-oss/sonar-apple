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
package fr.insideapp.sonarqube.apple.commons.xcode;

import fr.insideapp.sonarqube.apple.commons.result.models.Reference;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class XcodeResultExportCoverageArchiveRunnerTest {

    private static final String BASE_DIR = "/xcode";

    private XcodeResultExportCoverageArchiveRunner runner;

    @Before
    public void prepare() {
        runner = new XcodeResultExportCoverageArchiveRunner();
    }

    @Test
    public void arguments() {
        final List<Reference> references = List.of(new Reference("test1"), new Reference("test2"));
        List<String[]> options = runner.arguments(new File(BASE_DIR), new File(BASE_DIR), references);
        assertThat(options).hasSize(2);
        assertThat(options.get(0)).isEqualTo(new String[]{
                        "xcresulttool",
                        "export",
                        "--type", "directory",
                        "--path", "/xcode",
                        "--id", "test1",
                        "--output-path", "/xcode"
        });
        assertThat(options.get(1)).isEqualTo(new String[]{
                "xcresulttool",
                "export",
                "--type", "directory",
                "--path", "/xcode",
                "--id", "test2",
                "--output-path", "/xcode"
        });
    }

}