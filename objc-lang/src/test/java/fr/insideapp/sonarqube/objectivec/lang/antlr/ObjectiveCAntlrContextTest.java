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
package fr.insideapp.sonarqube.objectivec.lang.antlr;

import fr.insideapp.sonarqube.objc.lang.antlr.ObjectiveCAntlrContext;
import org.antlr.v4.runtime.Token;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.assertj.core.api.Assertions.assertThat;

public class ObjectiveCAntlrContextTest {

    @Test
    public void linesDetection() throws Throwable {
        String s = "NSString* test = @\"test\"";

        ObjectiveCAntlrContext result = new ObjectiveCAntlrContext();
        result.loadFromStreams(null, IOUtils.toInputStream(s, Charset.defaultCharset()),
                IOUtils.toInputStream(s, Charset.defaultCharset()), Charset.defaultCharset());

        for (Token t : result.getStream().getTokens()) {
            if (t.getType() == Token.EOF) {
                continue;
            }
            int[] start = result.getLineAndColumn(t.getStartIndex());
            int[] end = result.getLineAndColumn(t.getStopIndex());
            assertThat(start).isNotNull();
            assertThat(end).isNotNull();
            assertThat(t.getLine()).isEqualTo(start[0]);
            assertThat(t.getCharPositionInLine()).isEqualTo(start[1]);
        }
    }
}
