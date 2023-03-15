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
package fr.insideapp.sonarqube.apple.xcode.tests;

import fr.insideapp.sonarqube.apple.commons.tests.AbstractLanguageTestFileFinder;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.DefaultFileSystem;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public final class XcodeTestFileFinderTest {

    private static final String BASE_DIR = "/xcode/tests";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private static final String EXTENSION = "apple";


    private static final String TEST_FOLDER = "folder";

    private static final String TEST_FILENAME = "file";

    private static final String TEST_FILENAME_WITH_EXT = TEST_FILENAME + "." + EXTENSION;

    private DefaultFileSystem fileSystem;

    private DefaultInputFile file;

    private XcodeTestFileFinder finder;

    @Before
    public void prepare() {
        fileSystem = new DefaultFileSystem(baseDir);
        file = new TestInputFileBuilder("", TEST_FILENAME_WITH_EXT)
                .setModuleBaseDir(new File(baseDir, TEST_FOLDER).toPath())
                .setLanguage(EXTENSION)
                .build();
        fileSystem.add(file);
        AbstractLanguageTestFileFinder[] fileFinders = {
                new AbstractLanguageTestFileFinder(EXTENSION) {}
        };
        finder = new XcodeTestFileFinder(fileFinders);
    }

    @Test
    public void getUnitTestResource() {
        InputFile found = finder.getUnitTestResource(fileSystem, TEST_FOLDER, TEST_FILENAME);
        assertThat(found).isNotNull();
        assertThat(found.language()).isEqualTo(EXTENSION);
        assertThat(found.filename()).isEqualTo(TEST_FILENAME_WITH_EXT);

    }

    @Test
    public void getUnitTestResourceNotFound() {
        InputFile notFound = finder.getUnitTestResource(fileSystem, TEST_FOLDER, "ThisFileIsNotFound");
        assertThat(notFound).isNull();
    }

}
