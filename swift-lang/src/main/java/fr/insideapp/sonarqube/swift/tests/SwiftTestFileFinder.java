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
package fr.insideapp.sonarqube.swift.tests;

import fr.insideapp.sonarqube.apple.commons.TestFileFinder;

import org.apache.commons.lang3.StringUtils;
import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

public class SwiftTestFileFinder implements TestFileFinder {
    private static final Logger LOGGER = Loggers.get(SwiftTestFileFinder.class);

    @Override
    public InputFile getUnitTestResource(FileSystem fileSystem, String classname) {
        String fileName = classname.replace('.', '/') + ".swift";
        FilePredicate fp = fileSystem.predicates().hasPath(fileName);

        if(fileSystem.hasFiles(fp)) {
            return fileSystem.inputFile(fp);
        }

        /*
         * Most xcodebuild JUnit parsers don't include the path to the class in the class field, so search for it if it
         * wasn't found in the root.
         */
        String lastFileNameComponents = StringUtils.substringAfterLast(fileName, "/");
        if(!StringUtils.isEmpty(lastFileNameComponents)) {
            fp = fileSystem.predicates().and(
                fileSystem.predicates().hasType(InputFile.Type.TEST),
                fileSystem.predicates().matchesPathPattern("**/" + lastFileNameComponents)
            );

            if(fileSystem.hasFiles(fp)) {
                /*
                 * Lazily get the first file, since we wouldn't be able to determine the correct one from just the
                 * test class name in the event that there are multiple matches.
                 */
                return fileSystem.inputFiles(fp).iterator().next();
            }
        }

        LOGGER.info("Unable to locate Swift test source file for classname {}. Make sure your test class name matches its filename.", classname);
        return null;
    }
}
