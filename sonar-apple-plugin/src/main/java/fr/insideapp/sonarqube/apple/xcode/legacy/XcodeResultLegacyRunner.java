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
package fr.insideapp.sonarqube.apple.xcode.legacy;

import org.sonar.api.scanner.ScannerSide;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ScannerSide
public final class XcodeResultLegacyRunner extends XcodeResultLegacyRunnable {

    private static final Integer MIN_VERSION = 23_021;

    private static final Pattern PATTERN = Pattern.compile("xcresulttool version (?<version>\\d+),.*");

    public XcodeResultLegacyRunner() {
        super("xcrun");
    }

    protected String[] arguments() {
        return new String[]{
                "xcresulttool", "version"
        };
    }

    public boolean check() {
        String result = run(arguments()).trim();
        Matcher versionMatcher = PATTERN.matcher(result);
        if (versionMatcher.find()) {
            try {
                int version = Integer.parseInt(versionMatcher.group("version"));
                return version >= MIN_VERSION;
            } catch (NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }
    }

}