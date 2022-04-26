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
package fr.insideapp.sonarqube.objectivec.lang.tests;

import fr.insideapp.sonarqube.objc.lang.tests.ObjectiveCTestFileFinder;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.DefaultFileSystem;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;

import java.io.File;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ObjectiveCTestFileFinderTest {

    @Test
    public void getUnitTestResource() {

        DefaultFileSystem fs = new DefaultFileSystem(new File("src/test/resources"));
        DefaultInputFile testFile = new TestInputFileBuilder("", "objc/main.m").setLanguage("objc").build();
        fs.add(testFile);

        ObjectiveCTestFileFinder finder = new ObjectiveCTestFileFinder();
        InputFile found = finder.getUnitTestResource(fs, "objc/main");
        assertThat(found).isNotNull();
        assertThat(found.filename()).isEqualTo("main.m");

    }

    @Test
    public void getUnitTestResourceNotFound() {

        DefaultFileSystem fs = new DefaultFileSystem(new File("src/test/resources"));

        ObjectiveCTestFileFinder finder = new ObjectiveCTestFileFinder();
        InputFile found = finder.getUnitTestResource(fs, "objc/main");
        assertThat(found).isNull();

    }
}
