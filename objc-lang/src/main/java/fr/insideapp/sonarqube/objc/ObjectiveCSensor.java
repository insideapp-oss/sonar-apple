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
package fr.insideapp.sonarqube.objc;

import fr.insideapp.sonarqube.apple.commons.antlr.ParseTreeAnalyzer;
import fr.insideapp.sonarqube.objc.antlr.ObjectiveCAntlrContext;
import fr.insideapp.sonarqube.objc.antlr.ObjectiveCCyclomaticComplexityVisitor;
import fr.insideapp.sonarqube.objc.antlr.ObjectiveCHighlighterVisitor;
import fr.insideapp.sonarqube.objc.antlr.ObjectiveCSourceLinesVisitor;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;

public class ObjectiveCSensor implements Sensor {

    private final ObjectiveC objectiveC;
    private final ObjectiveCAntlrContext antlrContext;
    private final ObjectiveCSourceLinesVisitor sourceLinesVisitor;
    private final ObjectiveCHighlighterVisitor highlighterVisitor;
    private final ObjectiveCCyclomaticComplexityVisitor cyclomaticComplexityVisitor;

    public ObjectiveCSensor(
            final ObjectiveC objectiveC,
            final ObjectiveCAntlrContext antlrContext,
            final ObjectiveCSourceLinesVisitor sourceLinesVisitor,
            final ObjectiveCHighlighterVisitor highlighterVisitor,
            final ObjectiveCCyclomaticComplexityVisitor cyclomaticComplexityVisitor
    ) {
        this.objectiveC = objectiveC;
        this.antlrContext = antlrContext;
        this.sourceLinesVisitor = sourceLinesVisitor;
        this.highlighterVisitor = highlighterVisitor;
        this.cyclomaticComplexityVisitor = cyclomaticComplexityVisitor;
    }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .onlyOnLanguage(objectiveC.getKey())
                .name("Objective-C Sensor")
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {
        // Analyse source files
        new ParseTreeAnalyzer(objectiveC.getKey(), InputFile.Type.MAIN, antlrContext, sensorContext)
                .analyze(sourceLinesVisitor, highlighterVisitor, cyclomaticComplexityVisitor);
        // Analyse test files (highlighter only)
        new ParseTreeAnalyzer(objectiveC.getKey(), InputFile.Type.TEST, antlrContext, sensorContext)
                .analyze(highlighterVisitor);
    }
}
