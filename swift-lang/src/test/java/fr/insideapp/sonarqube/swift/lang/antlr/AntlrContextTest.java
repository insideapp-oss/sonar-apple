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

import fr.insideapp.sonarqube.swift.lang.antlr.AntlrContext;
import fr.insideapp.sonarqube.swift.lang.antlr.AntlrUtils;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AntlrContextTest {
    @Test
    public void linesDetection() throws Throwable {
        String s = "let test = \"test\"";
        AntlrContext result = AntlrUtils.getRequest(s);
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
