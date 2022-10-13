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
package fr.insideapp.sonarqube.objc.tests;

import fr.insideapp.sonarqube.apple.commons.tests.TestFileFinder;
import org.apache.commons.lang3.StringUtils;
import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.Arrays;
import java.util.List;

public class ObjectiveCTestFileFinder implements TestFileFinder {

    private static final Logger LOGGER = Loggers.get(ObjectiveCTestFileFinder.class);
    @Override
    public InputFile getUnitTestResource(FileSystem fileSystem, String relativePathWithoutExtension) {
        List<String> elements = Arrays.asList(StringUtils.splitByWholeSeparator(relativePathWithoutExtension, "/"));
        List<String> lastTwoElements = elements.subList(Math.max(elements.size() - 2, 0), elements.size());
        String relativePath = StringUtils.join(lastTwoElements, "/");
        String path = relativePath + ".m";
        FilePredicate fp = fileSystem.predicates().hasPath(path);

        if(fileSystem.hasFiles(fp)){
            return fileSystem.inputFile(fp);
        }

        /*
         * Most xcodebuild JUnit parsers don't include the path to the class in the class field, so search for it if it
         * wasn't found in the root.
         */
        fp = fileSystem.predicates().and(
                fileSystem.predicates().hasType(InputFile.Type.TEST),
                fileSystem.predicates().matchesPathPattern(path.replace("_", "+"))
        );

        if(fileSystem.hasFiles(fp)){
            /*
             * Lazily get the first file, since we wouldn't be able to determine the correct one from just the
             * test class name in the event that there are multiple matches.
             */
            return fileSystem.inputFiles(fp).iterator().next();
        }

        LOGGER.info("Unable to locate Objective-C test source file for path {}. Make sure your test class name matches its filename.", relativePathWithoutExtension);
        return null;
    }
}
