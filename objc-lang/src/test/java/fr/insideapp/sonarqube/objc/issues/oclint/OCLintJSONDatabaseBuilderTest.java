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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.insideapp.sonarqube.objc.issues.oclint.builder.OCLintJSONCompilationDatabaseBuilder;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static org.assertj.core.api.Assertions.assertThat;

public final class OCLintJSONDatabaseBuilderTest {

    private static class Container {
        final String jsonCompilationDatabaseFolderPath;
        final int size;

        public Container(String jsonCompilationDatabaseFolderPath, int size) {
            this.jsonCompilationDatabaseFolderPath = jsonCompilationDatabaseFolderPath;
            this.size = size;
        }
    }

    private static final String BASE_DIR = "/oclint/builder";

    private OCLintJSONCompilationDatabaseBuilder builder;
    private File baseFolder;

    @Before
    public void prepare() {
        builder = new OCLintJSONCompilationDatabaseBuilder();
        baseFolder = FileUtils.toFile(getClass().getResource(BASE_DIR));
    }

    @Test
    public void build_invalid_noFile() throws JsonProcessingException {
        assertContainer(new Container(
                "invalidPath",
                0
        ));
    }

    @Test
    public void build_invalid_file() throws JsonProcessingException {
        assertContainer(new Container(
                "invalid",
                0
        ));
    }

    @Test
    public void build_noFile() throws JsonProcessingException {
        assertContainer(new Container(
                "noFile",
                0
        ));
    }

    @Test
    public void build_twoFiles() throws JsonProcessingException {
        assertContainer(new Container(
                "twoFiles",
                2
        ));
    }

    private void assertContainer(Container container) throws JsonProcessingException {
        // prepare
        File folder = new File(baseFolder, container.jsonCompilationDatabaseFolderPath);
        // test
        String compileCommands = builder.build(folder);
        // assert
        ObjectMapper objectMapper = new ObjectMapper()
                .disable(FAIL_ON_UNKNOWN_PROPERTIES)
                .enable(SerializationFeature.INDENT_OUTPUT);
        final ArrayList<?> jsonArray = objectMapper.readValue(compileCommands, ArrayList.class);
        assertThat(jsonArray).hasSize(container.size);
    }

}
