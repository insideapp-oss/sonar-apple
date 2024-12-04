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
import fr.insideapp.sonarqube.apple.xcode.legacy.XcodeResultLegacyRunnable;
import org.sonar.api.scanner.ScannerSide;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@ScannerSide
public final class XcodeResultReadObjectRunner extends XcodeResultReadObjectRunnable {

    private final XcodeResultLegacyRunnable legacyRunner;

    public XcodeResultReadObjectRunner(
            final XcodeResultLegacyRunnable legacyRunner
    ) {
        super("xcrun");
        this.legacyRunner = legacyRunner;
    }

    protected String[] arguments(File resultBundle, Reference reference) {
        List<String> arguments = new ArrayList<>();
        arguments.add("xcresulttool");
        arguments.add("get");
        arguments.add("--format");
        arguments.add("json");
        arguments.add("--path");
        arguments.add(resultBundle.getAbsolutePath());
        arguments.add("--id");
        arguments.add(reference.id);
        if (legacyRunner.check()) {
            arguments.add("--legacy");
        }
        return arguments.toArray(String[]::new);
    }

    public String run(File resultBundle, Reference reference) {
        return run(arguments(resultBundle, reference));
    }

}