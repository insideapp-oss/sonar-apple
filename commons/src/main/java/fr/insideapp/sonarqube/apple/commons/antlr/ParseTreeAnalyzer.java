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

import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.InputFile.Type;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.IOException;
import java.nio.charset.Charset;

public class ParseTreeAnalyzer {

    private static final Logger LOGGER = Loggers.get(ParseTreeAnalyzer.class);

    private final String languageKey;
    private final Type type;
    private final AntlrContext antlrContext;
    private final SensorContext sensorContext;

    public ParseTreeAnalyzer(String languageKey, Type type, AntlrContext antlrContext, SensorContext sensorContext) {
        this.languageKey = languageKey;
        this.type = type;
        this.antlrContext = antlrContext;
        this.sensorContext = sensorContext;
    }

    public void analyze(final ParseTreeItemVisitor... visitors) {

        FilePredicate hasLang = sensorContext.fileSystem().predicates().hasLanguage(languageKey);
        FilePredicate hasType = sensorContext.fileSystem().predicates().hasType(type);
        FilePredicate langAndType = sensorContext.fileSystem().predicates().and(hasLang, hasType);
        final Charset charset = sensorContext.fileSystem().encoding();

        for (InputFile inf : sensorContext.fileSystem().inputFiles(langAndType)) {

            // Visit source files
            try {
                antlrContext.loadFromFile(inf, charset);
                ParseTreeItemVisitor visitor = new CustomTreeVisitor(visitors);
                visitor.fillContext(sensorContext, antlrContext);
            } catch (IOException e) {
                LOGGER.warn("Unexpected error while analyzing file " + inf.filename(), e);
            }

        }

    }
}
