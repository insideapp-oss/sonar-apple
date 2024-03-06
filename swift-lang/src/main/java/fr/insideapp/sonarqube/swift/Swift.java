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
package fr.insideapp.sonarqube.swift;

import fr.insideapp.sonarqube.apple.commons.tests.LanguageTestFile;
import org.apache.commons.lang3.StringUtils;
import org.sonar.api.config.Configuration;
import org.sonar.api.resources.AbstractLanguage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class Swift extends AbstractLanguage implements LanguageTestFile {

    public static final List<String> FILE_SUFFIXES = List.of("swift");

    private Configuration configuration;
    
    public Swift(final Configuration configuration) {
        super("swift", "Swift");
        this.configuration = configuration;
    }

    @Override
    public String[] getFileSuffixes() {
        final List<String> providedFilesSuffixes = Arrays.asList(configuration.getStringArray(SwiftExtensionProvider.FILE_SUFFIXES_KEY))
            .stream()
            .map(String::trim)
            .filter(StringUtils::isNotBlank)
            .collect(Collectors.toList());
        final List<String> filesSuffixes = providedFilesSuffixes.isEmpty() ? FILE_SUFFIXES : providedFilesSuffixes;
        return filesSuffixes.stream().toArray(String[]::new);
    }

    @Override
    public String testFileExtension() {
        return "swift";
    }
}