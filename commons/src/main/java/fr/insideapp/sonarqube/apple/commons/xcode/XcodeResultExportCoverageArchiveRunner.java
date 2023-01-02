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

import fr.insideapp.sonarqube.apple.commons.cli.MultiCommandLineToolRunner;
import fr.insideapp.sonarqube.apple.commons.result.models.Reference;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class XcodeResultExportCoverageArchiveRunner extends XcodeResultExportCoverageArchiveRunnable {

    public XcodeResultExportCoverageArchiveRunner() {
        super("xcrun");
    }

    protected List<String[]> arguments(File resultBundle, File coverageArchive, List<Reference> archiveReferences) {
        List<String[]> arguments = new ArrayList<>();
        for (Reference archiveReference : archiveReferences) {
            arguments.add(new String[]{
                    "xcresulttool", "export", "--type", "directory",
                    "--path", resultBundle.getAbsolutePath(),
                    "--id", archiveReference.id,
                    "--output-path", coverageArchive.getAbsolutePath()
            });
        }
        return arguments;
    }

    public void run(File resultBundle, File coverageArchive, List<Reference> archiveReferences) {
        run(arguments(resultBundle, coverageArchive, archiveReferences));
    }


}