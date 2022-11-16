package fr.insideapp.sonarqube.apple.commons;

import org.sonar.api.config.Configuration;

import java.util.ArrayList;
import java.util.List;

public abstract class MultiCommandLineToolBuilder extends CommandLineToolBuilder implements CommandLineToolRunnable<List<String>> {

    public MultiCommandLineToolBuilder(Configuration configuration, String command) {
        super(configuration, command);
    }

    protected abstract String[] options(String source);

    public final List<String> run() {
        List<String> outputs = new ArrayList<>();
        for (String source : sources()) {
            outputs.add(build(options(source)).run().getOutputString());
        }
        return outputs;
    }
}
