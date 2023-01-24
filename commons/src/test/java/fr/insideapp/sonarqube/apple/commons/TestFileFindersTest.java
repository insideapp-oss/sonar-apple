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
package fr.insideapp.sonarqube.apple.commons;

import fr.insideapp.sonarqube.apple.commons.tests.TestFileFinder;
import fr.insideapp.sonarqube.apple.commons.tests.TestFileFinders;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.DefaultFileSystem;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;

import java.io.File;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class TestFileFindersTest {

    private static final String BASE_DIR = "src/test/resources";

    private static final String EXTENSION = "apple";


    private static final String TEST_FOLDER = "folder";

    private static final String TEST_FILENAME = "file";

    private static final String TEST_FILENAME_WITH_EXT = TEST_FILENAME + "." + EXTENSION;

    private DefaultFileSystem fileSystem;

    private DefaultInputFile file;

    @Before
    public void prepare() {
        fileSystem = new DefaultFileSystem(new File(BASE_DIR));
        file = new TestInputFileBuilder("", TEST_FILENAME_WITH_EXT)
                .setModuleBaseDir(Paths.get(BASE_DIR + "/" + TEST_FOLDER))
                .setLanguage(EXTENSION)
                .build();
        fileSystem.add(file);

        TestFileFinders.getInstance().reset();
        TestFileFinder fileFinder = new TestFileFinder(EXTENSION) {};
        TestFileFinders.getInstance().addFinder(fileFinder);
    }

    @After
    public void cleanup() {
        TestFileFinders.getInstance().reset();
    }

    @Test
    public void getUnitTestResource() {
        InputFile found = TestFileFinders.getInstance().getUnitTestResource(fileSystem, TEST_FOLDER, TEST_FILENAME);

        assertThat(found).isNotNull();
        assertThat(found.language()).isEqualTo(EXTENSION);
        assertThat(found.filename()).isEqualTo(TEST_FILENAME_WITH_EXT);

    }

    @Test
    public void getUnitTestResourceNotFound() {
        InputFile notFound = TestFileFinders.getInstance().getUnitTestResource(fileSystem, TEST_FOLDER, "ThisFileIsNotFound");

        assertThat(notFound).isNull();
    }

}
