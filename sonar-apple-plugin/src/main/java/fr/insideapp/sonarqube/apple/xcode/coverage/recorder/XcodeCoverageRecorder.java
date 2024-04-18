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
package fr.insideapp.sonarqube.apple.xcode.coverage.recorder;

import fr.insideapp.sonarqube.apple.xcode.coverage.models.XcodeCodeCoverage;
import fr.insideapp.sonarqube.apple.xcode.coverage.models.XcodeCodeCoverageMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.coverage.NewCoverage;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;

@ScannerSide
public final class XcodeCoverageRecorder implements XcodeCoverageRecordable {

    private static final Logger LOGGER = LoggerFactory.getLogger(XcodeCoverageRecorder.class);

    private final SensorContext context;

    public XcodeCoverageRecorder(SensorContext context) {
        this.context = context;
    }

    @Override
    public void save(List<XcodeCodeCoverage> codeCoverages) {
        LOGGER.info("{} code coverage data to handle", codeCoverages.size());
        for (XcodeCodeCoverage codeCoverage : codeCoverages) {
            LOGGER.debug("Collecting coverage data for {}", codeCoverage.filePath);
            InputFile resource = getFile(codeCoverage.filePath);
            if (resource == null) {
                // skipping coverage for this file, since it's unknown
                continue;
            }

            // building the new coverage object
            NewCoverage newCoverage = context.newCoverage();
            newCoverage.onFile(resource);

            for (XcodeCodeCoverageMetadata metadata : codeCoverage.coverageMetadata) {
                if (metadata.isExecutable) {
                    // it is possible the execution count overflows the int limit
                    // if this is the case, we fall back to the maximum value available
                    int hitsCount = metadata.hitsCount.intValue();
                    if (hitsCount < 0) {
                        hitsCount = Integer.MAX_VALUE;
                    }
                    // recording the line hit
                    newCoverage.lineHits(metadata.lineNumber, hitsCount);
                }
            }

            // saving!
            newCoverage.save();
        }
    }

    private InputFile getFile(String filePath) {
        FilePredicate fp = context.fileSystem().predicates().hasPath(filePath);
        if(context.fileSystem().hasFiles(fp)) {
            return context.fileSystem().inputFile(fp);
        } else {
            LOGGER.warn("Can't find file {}", filePath);
            return null;
        }
    }

}