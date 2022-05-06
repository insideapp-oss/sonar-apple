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
package fr.insideapp.sonarqube.swift.lang.antlr;

import fr.insideapp.sonarqube.apple.commons.antlr.AntlrContext;
import fr.insideapp.sonarqube.apple.commons.antlr.ParseTreeItemVisitor;
import fr.insideapp.sonarqube.swift.lang.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import static java.lang.String.format;

public class SwiftCyclomaticComplexityVisitor implements ParseTreeItemVisitor {

    private static final Logger LOGGER = Loggers.get(SwiftCyclomaticComplexityVisitor.class);

    private int complexity = 0;

    @Override
    public void apply(ParseTree tree) {

        final Class<? extends ParseTree> classz = tree.getClass();

        if(Swift5Parser.If_statementContext.class.equals(classz) ||
                Swift5Parser.For_in_statementContext.class.equals(classz) ||
                Swift5Parser.While_statementContext.class.equals(classz) ||
                Swift5Parser.Case_labelContext.class.equals(classz) ||
                Swift5Parser.Do_statementContext.class.equals(classz) ||
                Swift5Parser.Guard_statementContext.class.equals(classz) ||
                Swift5Parser.Function_bodyContext.class.equals(classz)
        ) {
            complexity++;
        } else if(
                Swift5Parser.ExpressionContext.class.equals(classz)
                && tree.getText().matches(".*\\?(.*):(.*)")
        ) {
            // For ternary operator
            complexity++;
        }
    }

    @Override
    public void fillContext(SensorContext context, AntlrContext antlrContext) {
        final InputFile file = antlrContext.getFile();

        synchronized (context) {
            try {
                context.<Integer>newMeasure().on(file).forMetric(CoreMetrics.COMPLEXITY).withValue(complexity).save();
                complexity = 0;
            } catch (final Throwable e) {
                LOGGER.warn(format("Unexpected adding complexity measures on file %s", file.absolutePath()), e);
            }
        }
    }

    public int getComplexity() {
        return complexity;
    }
}
