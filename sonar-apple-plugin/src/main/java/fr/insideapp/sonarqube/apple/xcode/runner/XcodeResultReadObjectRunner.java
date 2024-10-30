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
package fr.insideapp.sonarqube.apple.xcode.runner;

import fr.insideapp.sonarqube.apple.commons.result.models.Reference;
import org.sonar.api.scanner.ScannerSide;

import java.io.File;

@ScannerSide
public final class XcodeResultReadObjectRunner extends XcodeResultReadObjectRunnable {

    public XcodeResultReadObjectRunner() {
        super("xcrun");
    }

    protected String[] arguments(File resultBundle, Reference reference) {
        return new String[]{
                "xcresulttool", "get",
                "--legacy",
                "--format", "json",
                "--path", resultBundle.getAbsolutePath(),
                "--id", reference.id
        };
    }

    public String run(File resultBundle, Reference reference) {
        return run(arguments(resultBundle, reference));
    }

}