package fr.insideapp.sonarqube.apple.commons.cli;

import fr.insideapp.sonarqube.apple.commons.interfaces.CommandLineToolRunnable;
import org.sonar.api.config.Configuration;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.ArrayList;
import java.util.List;

public abstract class MultiCommandLineToolBuilder extends CommandLineToolBuilder implements CommandLineToolRunnable<List<String>> {

    private static final Logger LOGGER = Loggers.get(MultiCommandLineToolBuilder.class);

    public MultiCommandLineToolBuilder(Configuration configuration, String command) {
        super(configuration, command);
    }

    protected abstract String[] options(String source);

    @Override
    public List<String> run() {
        List<String> outputs = new ArrayList<>();
        for (String source : sources()) {
            try {
                String output = build(options(source)).run().getOutputString();
                outputs.add(output);
            } catch (Exception e) {
                LOGGER.error("Running failed. Run in verbose to get more information.");
                LOGGER.debug("{}", e);
            }
        }
        return outputs;
    }
}
