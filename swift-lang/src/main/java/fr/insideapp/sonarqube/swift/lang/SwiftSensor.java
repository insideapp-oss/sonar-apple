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
package fr.insideapp.sonarqube.swift.lang;

import fr.insideapp.sonarqube.apple.commons.antlr.AntlrContext;
import fr.insideapp.sonarqube.apple.commons.antlr.CustomTreeVisitor;
import fr.insideapp.sonarqube.apple.commons.antlr.ParseTreeAnalyzer;
import fr.insideapp.sonarqube.apple.commons.antlr.ParseTreeItemVisitor;
import fr.insideapp.sonarqube.swift.lang.antlr.CyclomaticComplexityVisitor;
import fr.insideapp.sonarqube.swift.lang.antlr.SwiftAntlrContext;
import fr.insideapp.sonarqube.swift.lang.antlr.SwiftSourceLinesVisitor;
import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SwiftSensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(SwiftSensor.class);

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .onlyOnLanguage(Swift.KEY)
                .name("Swift Sensor")
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {
        FilePredicate hasSwift = sensorContext.fileSystem().predicates().hasLanguage(Swift.KEY);

        final ExecutorService executorService = Executors.newWorkStealingPool();

        for(InputFile inf : sensorContext.fileSystem().inputFiles(hasSwift)){

            executorService.execute(() -> {
                // Visit source files
                final SwiftAntlrContext antlrContext = new SwiftAntlrContext();
                ParseTreeItemVisitor visitor = new CustomTreeVisitor(
                        new SwiftSourceLinesVisitor(),
                        new CyclomaticComplexityVisitor()
                );
                visitor.fillContext(sensorContext, antlrContext);
            });
        }
    }
}
