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

import fr.insideapp.sonarqube.swift.lang.SourceLine;
import fr.insideapp.sonarqube.swift.lang.SourceLinesProvider;
import fr.insideapp.sonarqube.swift.lang.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.InputStream;
import java.util.Optional;

public class SourceLinesVisitor implements ParseTreeItemVisitor {

    private static final Logger LOGGER = Loggers.get(SourceLinesVisitor.class);
    private final SourceLinesProvider linesProvider = new SourceLinesProvider();

    @Override
    public void apply(ParseTree tree) {}

    @Override
    public void fillContext(SensorContext context, AntlrContext antlrContext) {
        // reading the content of file
        try (InputStream stream = antlrContext.getFile().inputStream()) {
            // all the tokens of the file
            final Token[] tokens = antlrContext.getTokens();
            // preparing the array containing the total of lines of the source file
            final int[] linesTotal = new int[antlrContext.getLines().length];

            // iterating over all tokens of the file
            for (final Token token: tokens) {
                int type = token.getType();
                int startLine = token.getLine();
                Optional<int[]> endLines = Optional.of(antlrContext.getLineAndColumn(token.getStartIndex()));

                // checking we got valid token
                boolean hasInvalidToken = type == Swift5Parser.EOF || endLines.isEmpty() || endLines.get().length == 0 || token.getStartIndex() >= token.getStopIndex();
                if (hasInvalidToken) { continue; }

                // iterating over to count lines
                for (int i = startLine - 1 ; i < endLines.get()[0]; i++) {
                    switch(type) {
                        case Swift5Parser.Line_comment:
                        case Swift5Parser.Block_comment:
                            linesTotal[i] = 2; // comment
                            break;
                        default:
                            linesTotal[i] = 1; // code
                            break;
                    }

                }
            }

            int comments = 0;
            int locs = 0;
            for (final int lineType : linesTotal) {
                if (lineType == 1) {
                    locs++;
                } else if (lineType == 2) {
                    comments++;
                }
            }

            LOGGER.info(String.format("Comments = %i", comments));
            LOGGER.info(String.format("LOCs = %i", locs));
            // TODO: continue from here


        } catch (Throwable error) {
            LOGGER.error(error.getMessage(), error);
        }
    }
}
