package fr.insideapp.sonarqube.apple.commons.parser;

import fr.insideapp.sonarqube.apple.commons.ExceptionHelper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.assertj.core.api.Assertions.assertThat;

public final class AbstractReportParserTest {

    private AbstractReportParser parser;

    @Before
    public void prepare() {
        parser = mock(AbstractReportParser.class, Mockito.CALLS_REAL_METHODS);
    }

    @Test
    public void parse_failed() throws Exception {
        // prepare
        when(parser.perform(anyString())).thenThrow(ExceptionHelper.build());
        // test
        List<String> outputs = parser.parse(anyString());
        // assert
        assertThat(outputs).isEmpty();
    }

    @Test
    public void parse_succeed() throws Exception {
        // prepare
        when(parser.perform(anyString())).thenReturn(Arrays.asList("string_parsed"));
        // test
        List<String> outputs = parser.parse(anyString());
        // assert
        assertThat(outputs).hasSize(1);
        assertThat(outputs.get(0)).isEqualTo("string_parsed");
    }

}
