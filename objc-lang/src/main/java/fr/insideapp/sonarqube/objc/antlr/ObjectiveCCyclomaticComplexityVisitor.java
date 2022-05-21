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
package fr.insideapp.sonarqube.objc.antlr;

import fr.insideapp.sonarqube.apple.commons.antlr.AntlrContext;
import fr.insideapp.sonarqube.apple.commons.antlr.ParseTreeItemVisitor;
import fr.insideapp.sonarqube.objc.antlr.generated.ObjectiveCParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import static java.lang.String.format;

public class ObjectiveCCyclomaticComplexityVisitor implements ParseTreeItemVisitor  {

    private static final Logger LOGGER = Loggers.get(ObjectiveCCyclomaticComplexityVisitor.class);

    private int complexity = 0;

    @Override
    public void apply(ParseTree tree) {

        final Class<? extends ParseTree> classz = tree.getClass();

        if(ObjectiveCParser.FunctionSignatureContext.class.equals(classz) ||
                ObjectiveCParser.MethodDefinitionContext.class.equals(classz) ||
                ObjectiveCParser.ForInStatementContext.class.equals(classz) ||
                ObjectiveCParser.ForStatementContext.class.equals(classz) ||
                ObjectiveCParser.SwitchSectionContext.class.equals(classz) ||
                ObjectiveCParser.WhileStatementContext.class.equals(classz) ||
                ObjectiveCParser.DoStatementContext.class.equals(classz) ||
                (ObjectiveCParser.StatementContext.class.equals(classz) && tree.getText().matches("(.*)=(.*)\\?(.*):(.*)"))) { // To detect ternary operator
            complexity++;
        }

        // To detect if statement
        if((ObjectiveCParser.SelectionStatementContext.class.equals(classz) && tree.getText().matches("if(.*)\\((.*)\\)\\{(.*)}(.*)"))) {
            complexity++;

            // Each matches of && and || add 1 to complexity
            complexity += StringUtils.countMatches(tree.getText(), "&&");
            complexity += StringUtils.countMatches(tree.getText(), "||");
        }
    }

    @Override
    public void fillContext(SensorContext context, AntlrContext antlrContext) {
        final InputFile file = antlrContext.getFile();

        synchronized (ObjectiveCCyclomaticComplexityVisitor.class) {
            try {
                context.<Integer>newMeasure().on(file).forMetric(CoreMetrics.COMPLEXITY).withValue(complexity).save();
            } catch (final Exception e) {
                LOGGER.warn(format("Unexpected adding complexity measures on file %s", file.key()), e);
            }
            complexity = 0;
        }
    }
}
