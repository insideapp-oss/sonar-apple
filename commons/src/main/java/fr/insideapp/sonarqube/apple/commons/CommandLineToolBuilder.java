package fr.insideapp.sonarqube.apple.commons;

import org.buildobjects.process.ProcBuilder;
import org.sonar.api.config.Configuration;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public abstract class CommandLineToolBuilder {

    private static final Logger LOGGER = Loggers.get(RunningSourcesCLISensor.class);
    private static final int COMMAND_TIMEOUT = 10 * 60 * 1000;
    private static final Integer DEFAULT_COMMAND_EXIT_CODE = 0;

    private final Configuration configuration;

    private final ProcBuilder command;

    public CommandLineToolBuilder(
            Configuration configuration,
            String command
    ) {
        this.configuration = configuration;
        this.command = new ProcBuilder(command);
    }

    protected Integer[] exitCodes() {
        return new Integer[]{DEFAULT_COMMAND_EXIT_CODE};
    }

    protected final List<String> sources() {
        return Arrays.asList(configuration.get("sonar.sources").orElse(".").split(","));
    }

    protected final ProcBuilder build(String[] options) {
        ProcBuilder builtCommand = command
                .withArgs(options)
                .withTimeoutMillis(COMMAND_TIMEOUT)
                .withExpectedExitStatuses(Set.of(exitCodes()));
        LOGGER.info("Command that will be executed: `{}", builtCommand.getCommandLine());
        return builtCommand;
    }

}

