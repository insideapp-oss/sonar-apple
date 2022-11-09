package fr.insideapp.sonarqube.objc.issues.oclint;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.insideapp.sonarqube.objc.issues.oclint.models.OCLintReport;
import org.buildobjects.process.ProcBuilder;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.File;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

public class OCLintExtractor {

    private static final Logger LOGGER = Loggers.get(OCLintExtractor.class);
    private static final int COMMAND_TIMEOUT = 30 * 60 * 1000;
    private static final int COMMAND_EXIT_CODE = 0;
    private final SensorContext context;

    private ObjectMapper objectMapper;

    public OCLintExtractor(SensorContext context) {
        this.context = context;
        objectMapper = new ObjectMapper()
                .disable(FAIL_ON_UNKNOWN_PROPERTIES)
                .enable(SerializationFeature.INDENT_OUTPUT);
    }

    public OCLintReport extract(File compileCommandsFolder) throws JsonProcessingException {
        String jsonReport = new ProcBuilder("oclint-json-compilation-database")
                .withArgs(buildSourceArguments())
                .withArgs("-p", compileCommandsFolder.getAbsolutePath())
                .withArgs("--")
                .withArgs("-report-type", "json")
                .withTimeoutMillis(COMMAND_TIMEOUT)
                .withExpectedExitStatuses(COMMAND_EXIT_CODE)
                .run()
                .getOutputString();

        OCLintReport oclintReport = objectMapper.readValue(jsonReport, OCLintReport.class);
        LOGGER.info("OCLint found {} violation(s)", oclintReport.violations.length);
        return oclintReport;
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
