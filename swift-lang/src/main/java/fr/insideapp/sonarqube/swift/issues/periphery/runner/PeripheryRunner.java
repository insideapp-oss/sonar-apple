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

import fr.insideapp.sonarqube.apple.commons.ApplePluginExtensionProvider;
import fr.insideapp.sonarqube.apple.commons.cli.SingleCommandLineToolRunner;
import fr.insideapp.sonarqube.swift.issues.periphery.PeripheryExtensionProvider;
import org.sonar.api.config.Configuration;
import org.sonar.api.scanner.ScannerSide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@ScannerSide
public final class PeripheryRunner extends SingleCommandLineToolRunner implements PeripheryRunnable {

    private final Configuration configuration;
    private final ApplePluginExtensionProvider applePluginExtensionProvider;
    private final PeripheryExtensionProvider peripheryExtensionProvider;

    public PeripheryRunner(
            final Configuration configuration,
            final ApplePluginExtensionProvider applePluginExtensionProvider,
            final PeripheryExtensionProvider peripheryExtensionProvider
    ) {
        super("periphery");
        this.configuration = configuration;
        this.applePluginExtensionProvider = applePluginExtensionProvider;
        this.peripheryExtensionProvider = peripheryExtensionProvider;
    }

    @Override
    protected String[] options() {
        List<String> options = new ArrayList<>();
        options.add("scan");
        options.addAll(xcode());
        options.addAll(schemes());
        options.addAll(targets());
        options.add("--skip-build");
        options.addAll(indexStorePath());
        options.addAll(Arrays.asList("--format", "json"));
        options.add("--quiet");
        return options.stream().toArray(String[]::new);
    }

    private List<String> xcode() {
        List<String> options = new ArrayList<>();
        Optional<String> workspace = applePluginExtensionProvider.workspace(configuration);
        Optional<String> project = applePluginExtensionProvider.project(configuration);
        if (workspace.isPresent()) {
            options.addAll(Arrays.asList("--workspace", workspace.get()));
        } else project.ifPresent(s -> options.addAll(Arrays.asList("--project", s)));
        return options;
    }

    private List<String> schemes() {
        List<String> options = new ArrayList<>();
        List<String> schemes = peripheryExtensionProvider.schemes(configuration);
        if (!schemes.isEmpty()) {
            options.add("--schemes");
            options.addAll(schemes);
        }
        return options;
    }

    private List<String> targets() {
        List<String> options = new ArrayList<>();
        List<String> targets = peripheryExtensionProvider.targets(configuration);
        if (!targets.isEmpty()) {
            options.add("--targets");
            options.addAll(targets);
        }
        return options;
    }

    private List<String> indexStorePath() {
        List<String> options = new ArrayList<>();
        Optional<String> indexStorePath = peripheryExtensionProvider.indexStorePath(configuration);
        indexStorePath.ifPresent(s -> options.addAll(Arrays.asList("--index-store-path", s)));
        return options;
    }

}
