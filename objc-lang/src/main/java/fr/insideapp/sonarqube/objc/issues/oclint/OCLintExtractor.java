package fr.insideapp.sonarqube.objc.issues.oclint;

import org.buildobjects.process.ProcBuilder;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.File;

public class OCLintExtractor {

    private static final Logger LOGGER = Loggers.get(OCLintExtractor.class);
    private static final int COMMAND_TIMEOUT = 30 * 60 * 1000;
    private static final int COMMAND_EXIT_CODE = 0;
    private final SensorContext context;

    public OCLintExtractor(SensorContext context) {
        this.context = context;
    }

    public void extract(File compileCommandsFolder) {
        String oclintReport = new ProcBuilder("oclint-json-compilation-database")
                .withArgs(buildSourceArguments())
                .withArgs("-p", compileCommandsFolder.getAbsolutePath())
                .withArgs("--", "-report-type", "json")
                .withTimeoutMillis(COMMAND_TIMEOUT)
                .withExpectedExitStatuses(COMMAND_EXIT_CODE)
                .run()
                .getOutputString();

    }

    private String[] buildSourceArguments() {
        final String sourcesInput = context.config().get("sonar.sources").orElse(".");
        final String[] sources = sourcesInput.split(",");
        final String[] sourceArgs = new String[sources.length * 2];
        for (int i = 0; i < sources.length; i++) {
            sourceArgs[i * 2] = "--include";
            sourceArgs[i * 2 + 1] = String.format("%s", sources[i]);
        }
        return sourceArgs;
    }

}
