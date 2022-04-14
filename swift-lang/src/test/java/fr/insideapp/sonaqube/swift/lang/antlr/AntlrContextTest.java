package fr.insideapp.sonaqube.swift.lang.antlr;

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
