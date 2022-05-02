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
package fr.insideapp.sonarqube.apple.commons.antlr;

import fr.insideapp.sonarqube.apple.commons.SensorRuntimeException;
import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ParseTreeAnalyzer {

    private static final int EXECUTOR_TIMEOUT = 10000;

    private static final Logger LOGGER = Loggers.get(ParseTreeAnalyzer.class);

    private final String languageKey;
    private final AntlrContext antlrContext;
    private final SensorContext sensorContext;

    public ParseTreeAnalyzer(String languageKey, AntlrContext antlrContext, SensorContext sensorContext) {
        this.languageKey = languageKey;
        this.antlrContext = antlrContext;
        this.sensorContext = sensorContext;
    }

    public void analyze(final ParseTreeItemVisitor... visitors) {

        FilePredicate hasLang = sensorContext.fileSystem().predicates().hasLanguage(languageKey);
        FilePredicate isMain = sensorContext.fileSystem().predicates().hasType(InputFile.Type.MAIN);
        FilePredicate swiftAndMain = sensorContext.fileSystem().predicates().and(hasLang, isMain);
        final Charset charset = sensorContext.fileSystem().encoding();

        final ExecutorService executorService = Executors.newWorkStealingPool();

        for(InputFile inf : sensorContext.fileSystem().inputFiles(swiftAndMain)){

            executorService.execute(() -> {
                // Visit source files
                try {
                    antlrContext.loadFromFile(inf, charset);
                    ParseTreeItemVisitor visitor = new CustomTreeVisitor(visitors);
                    visitor.fillContext(sensorContext, antlrContext);
                } catch (IOException e) {
                    LOGGER.warn("Unexpected error while analyzing file " + inf.filename(), e);
                }
            });

        }

        try {
            executorService.shutdown();
            executorService.awaitTermination(EXECUTOR_TIMEOUT, TimeUnit.SECONDS);
            executorService.shutdownNow();
        } catch (final InterruptedException e) {
            LOGGER.warn("Unexpected error while running waiting for executor service to finish", e);
            Thread.currentThread().interrupt();
            throw new SensorRuntimeException(e);
        }
    }
}
