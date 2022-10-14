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
package fr.insideapp.sonarqube.apple.commons.tests;

import org.apache.commons.lang3.StringUtils;
import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.Arrays;
import java.util.List;

public abstract class TestFileFinder {

    private static final Logger LOGGER = Loggers.get(TestFileFinder.class);

    private String extension;

    public TestFileFinder(String extension) {
        this.extension = extension;
    }

    public final InputFile getUnitTestResource(FileSystem fileSystem, String bundleName, String className) {
        StringBuilder pathPatternBuilder = new StringBuilder(bundleName)
                .append("/**/")
                .append(className)
                .append(".")
                .append(extension);
        String pathPattern = pathPatternBuilder.toString();

        FilePredicate fileMatchesPredicate = fileSystem.predicates().matchesPathPattern(pathPattern);
        if(fileSystem.hasFiles(fileMatchesPredicate)) {
            /* Lazily get the first file, since we wouldn't be able to determine the correct one from just the
             * test class name in the event that there are multiple matches. */
            return fileSystem.inputFiles(fileMatchesPredicate).iterator().next();
        } else {
            return null;
        }

    }
}
