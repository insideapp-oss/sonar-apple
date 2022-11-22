package fr.insideapp.sonarqube.swift.issues.periphery.runner;

import fr.insideapp.sonarqube.apple.commons.ApplePluginExtensionProvider;
import fr.insideapp.sonarqube.apple.commons.cli.SingleCommandLineToolBuilder;
import fr.insideapp.sonarqube.swift.issues.periphery.PeripheryExtensionProvider;
import org.sonar.api.config.Configuration;
import org.sonar.api.scanner.ScannerSide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@ScannerSide
public final class PeripheryRunner extends SingleCommandLineToolBuilder implements PeripheryRunnable {

    public PeripheryRunner(Configuration configuration) {
        super(configuration, "periphery");
    }

    @Override
    protected String[] options(List<String> sources) {
        List<String> options = new ArrayList<>();
        options.add("scan");
        options.addAll(xcode());
        options.addAll(schemes());
        options.addAll(targets());
        options.addAll(Arrays.asList("--skip-build"));
        options.addAll(indexStorePath());
        options.addAll(Arrays.asList("--format", "json"));
        options.addAll(Arrays.asList("--quiet"));
        return options.stream().toArray(String[]::new);
    }

    private List<String> xcode() {
        List<String> options = new ArrayList<>();
        Optional<String> workspace = ApplePluginExtensionProvider.workspace(configuration);
        Optional<String> project = ApplePluginExtensionProvider.project(configuration);
        if (workspace.isPresent()) {
            options.addAll(Arrays.asList("--workspace", workspace.get()));
        } else if (project.isPresent()) {
            options.addAll(Arrays.asList("--project", project.get()));
        } else {
            // no op
            // for example Swift Package
        }
        return options;
    }

    private List<String> schemes() {
        List<String> options = new ArrayList<>();
        Optional<String> schemes = PeripheryExtensionProvider.schemes(configuration);
        if (schemes.isPresent()) {
            options.add("--schemes");
            options.addAll(Arrays.asList(schemes.get().split(",")));
        } else {
            // no op
            // for example Swift Package
        }
        return options;
    }

    private List<String> targets() {
        List<String> options = new ArrayList<>();
        Optional<String> targets = PeripheryExtensionProvider.targets(configuration);
        if (targets.isPresent()) {
            options.add("--targets");
            options.addAll(Arrays.asList(targets.get().split(",")));
        } else {
            // no op
            // for example Swift Package
        }
        return options;
    }

    private List<String> indexStorePath() {
        List<String> options = new ArrayList<>();
        Optional<String> indexStorePath = PeripheryExtensionProvider.indexStorePath(configuration);
        if (indexStorePath.isPresent()) {
            options.addAll(Arrays.asList("--index-store-path", indexStorePath.get()));
        }
        return options;
    }

}
