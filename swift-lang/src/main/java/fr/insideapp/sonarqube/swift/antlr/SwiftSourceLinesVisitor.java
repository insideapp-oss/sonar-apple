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
package fr.insideapp.sonarqube.swift.antlr;

import fr.insideapp.sonarqube.apple.commons.antlr.AntlrContext;
import fr.insideapp.sonarqube.apple.commons.antlr.ParseTreeItemVisitor;
import fr.insideapp.sonarqube.apple.commons.antlr.SourceLinesVisitor;
import fr.insideapp.sonarqube.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.scanner.ScannerSide;

@ScannerSide
public class SwiftSourceLinesVisitor implements ParseTreeItemVisitor {

    private final SourceLinesVisitor sourceLinesVisitor;

    public SwiftSourceLinesVisitor() {
        sourceLinesVisitor = new SourceLinesVisitor.Builder()
                .whiteSpaceToken(Swift5Parser.WS)
                .singleLineCommentToken(Swift5Parser.Line_comment)
                .multiLineCommentToken(Swift5Parser.Block_comment)
                .interpolationMultiLineToken(Swift5Parser.Interpolataion_multi_line)
                .quotedMultiLineTextToken(Swift5Parser.Quoted_multi_line_text)
                .quotedMultiLineExtendedTextToken(Swift5Parser.Quoted_multi_line_extended_text)
                .classToken(Swift5Parser.CLASS)
                .functionToken(Swift5Parser.FUNC)
                .build();
    }
    @Override
    public void apply(ParseTree tree) {
        sourceLinesVisitor.apply(tree);
    }

    @Override
    public void fillContext(SensorContext context, AntlrContext antlrContext) {
        sourceLinesVisitor.fillContext(context, antlrContext);
    }

}
