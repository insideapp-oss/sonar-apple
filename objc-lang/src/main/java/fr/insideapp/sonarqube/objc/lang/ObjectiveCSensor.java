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
package fr.insideapp.sonarqube.objc.lang;

import fr.insideapp.sonarqube.apple.commons.antlr.ParseTreeAnalyzer;
import fr.insideapp.sonarqube.objc.lang.antlr.ObjectiveCCyclomaticComplexityVisitor;
import fr.insideapp.sonarqube.objc.lang.antlr.ObjectiveCHighlighterVisitor;
import fr.insideapp.sonarqube.objc.lang.antlr.ObjectiveCAntlrContext;
import fr.insideapp.sonarqube.objc.lang.antlr.ObjectiveCSourceLinesVisitor;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;

public class ObjectiveCSensor implements Sensor {

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .onlyOnLanguage(ObjectiveC.KEY)
                .name("Objective-C Sensor")
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {
        final ObjectiveCAntlrContext antlrContext = new ObjectiveCAntlrContext();
        // Analyse source files
        new ParseTreeAnalyzer(ObjectiveC.KEY, InputFile.Type.MAIN, antlrContext, sensorContext)
                .analyze(new ObjectiveCSourceLinesVisitor(), new ObjectiveCHighlighterVisitor(), new ObjectiveCCyclomaticComplexityVisitor());
        // Analyse test files (highlighter only)
        new ParseTreeAnalyzer(ObjectiveC.KEY, InputFile.Type.TEST, antlrContext, sensorContext)
                .analyze(new ObjectiveCHighlighterVisitor());
    }
}
