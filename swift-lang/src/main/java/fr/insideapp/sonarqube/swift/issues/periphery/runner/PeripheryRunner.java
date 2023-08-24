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
package fr.insideapp.sonarqube.swift.issues.periphery.runner;

import fr.insideapp.sonarqube.swift.issues.periphery.PeripheryExtensionProvider;
import org.sonar.api.config.Configuration;
import org.sonar.api.scanner.ScannerSide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@ScannerSide
public final class PeripheryRunner extends PeripheryRunnable {

    private final Configuration configuration;
    private final PeripheryExtensionProvider peripheryExtensionProvider;

    public PeripheryRunner(
            final Configuration configuration,
            final PeripheryExtensionProvider peripheryExtensionProvider
    ) {
        super("periphery");
        this.configuration = configuration;
        this.peripheryExtensionProvider = peripheryExtensionProvider;
    }

    @Override
    protected String[] arguments() {
        List<String> options = new ArrayList<>();
        options.add("scan");
        options.add("--skip-build");
        options.addAll(indexStorePath());
        options.addAll(Arrays.asList("--format", "json"));
        options.add("--quiet");
        return options.stream().toArray(String[]::new);
    }

    private List<String> indexStorePath() {
        List<String> options = new ArrayList<>();
        Optional<String> indexStorePath = peripheryExtensionProvider.indexStorePath(configuration);
        indexStorePath.ifPresent(s -> options.addAll(Arrays.asList("--index-store-path", s)));
        return options;
    }

}
