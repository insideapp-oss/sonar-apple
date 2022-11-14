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

import org.json.JSONArray;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class OCLintJSONDatabaseBuilderTest {

    private static class Container {
        final String jsonCompilationDatabasePath;
        final int size;

        public Container(String jsonCompilationDatabasePath, int size) {
            this.jsonCompilationDatabasePath = jsonCompilationDatabasePath;
            this.size = size;
        }
    }

    private static final String BASE_DIR = "src/test/resources/oclint/compilation_database";

    private OCLintJSONDatabaseBuilder builder;
    private File baseFolder;

    @Before
    public void prepare() {
        builder = new OCLintJSONDatabaseBuilder();
        baseFolder = new File(BASE_DIR);
    }

    @Test
    public void buildNoFile() {
        assertContainer(new Container(
                "noFile",
                0
        ));
    }

    @Test
    public void buildTwoFiles() {
        assertContainer(new Container(
                "twoFiles",
                2
        ));
    }

    private void assertContainer(Container container) {
        File folder = new File(baseFolder, container.jsonCompilationDatabasePath);

        // Running our code
        String compileCommands = builder.build(folder);

        // Asserting
        JSONArray jsonArray = new JSONArray(compileCommands);
        assertThat(jsonArray).hasSize(container.size);
    }

}
