package fr.insideapp.sonarqube.apple.commons.cli;

import fr.insideapp.sonarqube.apple.commons.interfaces.CommandLineToolRunnable;
import org.sonar.api.config.Configuration;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.List;

public abstract class SingleCommandLineToolBuilder extends CommandLineToolBuilder implements CommandLineToolRunnable<String> {

    private static final Logger LOGGER = Loggers.get(SingleCommandLineToolBuilder.class);

    protected SingleCommandLineToolBuilder(Configuration configuration, String command) {
        super(configuration, command);
    }

    public abstract String[] options(List<String> sources);

    @Override
    public String run() {
        try {
            return build(options(sources()))
                    .run()
                    .getOutputString();
        } catch (Exception e) {
            LOGGER.error("Running failed. Run in verbose to get more information.");
            LOGGER.debug("{}", e);
            return "";
        }

    }

}
