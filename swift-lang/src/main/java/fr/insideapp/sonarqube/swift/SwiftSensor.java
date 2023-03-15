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
package fr.insideapp.sonarqube.swift;

import fr.insideapp.sonarqube.apple.commons.antlr.ParseTreeAnalyzer;
import fr.insideapp.sonarqube.swift.antlr.SwiftAntlrContext;
import fr.insideapp.sonarqube.swift.antlr.SwiftHighlighterVisitor;
import fr.insideapp.sonarqube.swift.antlr.SwiftCyclomaticComplexityVisitor;
import fr.insideapp.sonarqube.swift.antlr.SwiftSourceLinesVisitor;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;

public class SwiftSensor implements Sensor {

    private final Swift swift;

    private final SwiftAntlrContext antlrContext;
    private final SwiftSourceLinesVisitor sourceLinesVisitor;
    private final SwiftHighlighterVisitor highlighterVisitor;
    private final SwiftCyclomaticComplexityVisitor cyclomaticComplexityVisitor;

    public SwiftSensor(
            final Swift swift,
            final SwiftAntlrContext antlrContext,
            final SwiftSourceLinesVisitor sourceLinesVisitor,
            final SwiftHighlighterVisitor highlighterVisitor,
            final SwiftCyclomaticComplexityVisitor cyclomaticComplexityVisitor
    ) {
        this.swift = swift;
        this.antlrContext = antlrContext;
        this.sourceLinesVisitor = sourceLinesVisitor;
        this.highlighterVisitor = highlighterVisitor;
        this.cyclomaticComplexityVisitor = cyclomaticComplexityVisitor;
    }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .onlyOnLanguage(swift.getKey())
                .name("Swift Sensor")
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {
        // Analyse source files
        new ParseTreeAnalyzer(swift.getKey(), InputFile.Type.MAIN, antlrContext, sensorContext)
                .analyze(sourceLinesVisitor, highlighterVisitor, cyclomaticComplexityVisitor);
        // Analyse test files (highlighter only)
        new ParseTreeAnalyzer(swift.getKey(), InputFile.Type.TEST, antlrContext, sensorContext)
                .analyze(highlighterVisitor);
    }
}
