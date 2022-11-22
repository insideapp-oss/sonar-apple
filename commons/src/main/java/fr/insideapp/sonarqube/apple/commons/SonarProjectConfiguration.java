package fr.insideapp.sonarqube.apple.commons;

import org.sonar.api.config.Configuration;
import org.sonar.api.scanner.ScannerSide;

import java.util.Arrays;
import java.util.List;

@ScannerSide
public class SonarProjectConfiguration {

    private final Configuration configuration;

    public SonarProjectConfiguration(final Configuration configuration) {
        this.configuration = configuration;
    }

    public List<String> sources() {
        return Arrays.asList(configuration.getStringArray("sonar.sources"));
    }


}
