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
package fr.insideapp.sonarqube.objc.lang.antlr;

import fr.insideapp.sonarqube.apple.commons.antlr.AntlrContext;
import fr.insideapp.sonarqube.apple.commons.antlr.ParseTreeItemVisitor;
import fr.insideapp.sonarqube.apple.commons.antlr.SourceLinesVisitor;
import fr.insideapp.sonarqube.objc.lang.antlr.generated.ObjectiveCParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.sensor.SensorContext;

public class ObjectiveCSourceLinesVisitor implements ParseTreeItemVisitor {

    private final SourceLinesVisitor sourceLinesVisitor;

    public ObjectiveCSourceLinesVisitor() {
        sourceLinesVisitor = new SourceLinesVisitor.Builder()
                .whiteSpaceToken(ObjectiveCParser.WS)
                .singleLineCommentToken(ObjectiveCParser.SINGLE_COMMENT)
                .multiLineCommentToken(ObjectiveCParser.MULTI_COMMENT)
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