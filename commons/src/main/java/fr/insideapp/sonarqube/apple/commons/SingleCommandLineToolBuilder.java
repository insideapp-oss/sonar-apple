package fr.insideapp.sonarqube.apple.commons;

import org.sonar.api.config.Configuration;

import java.util.List;

public abstract class SingleCommandLineToolBuilder extends CommandLineToolBuilder implements CommandLineToolRunnable<String> {

    protected SingleCommandLineToolBuilder(Configuration configuration, String command) {
        super(configuration, command);
    }

    public abstract String[] options(List<String> sources);

    public final String run() {
        return build(options(sources()))
                .run()
                .getOutputString();

    }
}
