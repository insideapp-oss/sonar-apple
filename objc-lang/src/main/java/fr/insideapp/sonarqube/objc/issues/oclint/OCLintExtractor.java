/*
 * SonarQube Apple Plugin - Enables analysis of Swift and Objective-C projects into SonarQube.
 * Copyright © 2022 inside|app (contact@insideapp.fr)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
            sourceArgs[i * 2 + 1] = String.format("./%s", sources[i]);
        }
        return sourceArgs;
    }

}
