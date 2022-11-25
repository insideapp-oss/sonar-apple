package fr.insideapp.sonarqube.apple.mobsfscan.runner;

import fr.insideapp.sonarqube.apple.commons.SonarProjectConfiguration;
import fr.insideapp.sonarqube.apple.commons.cli.SingleCommandLineToolRunner;
import org.sonar.api.scanner.ScannerSide;

import java.util.ArrayList;
import java.util.List;

@ScannerSide
public final class MobSFScanRunner extends SingleCommandLineToolRunner implements MobSFScanRunnable {

    private final SonarProjectConfiguration sonarProjectConfiguration;

    public MobSFScanRunner(
            final SonarProjectConfiguration sonarProjectConfiguration
    ) {
        super("mobsfscan");
        this.sonarProjectConfiguration = sonarProjectConfiguration;
    }

    @Override
    protected String[] options() {
        List<String> options = new ArrayList<>();
        options.add("--json");
        options.addAll(sonarProjectConfiguration.sources());
        return options.stream().toArray(String[]::new);
    }
}
