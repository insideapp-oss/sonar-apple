package fr.insideapp.sonarqube.apple.commons.cli;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.sonar.api.config.Configuration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class SingleCommandLineToolBuilderTest {

    private SingleCommandLineToolBuilder builder;

    private Configuration configuration;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
    }

    @Test
    public void run_no_option() {
        // prepare
        builder = makeMock("echo");
        when(builder.options(any())).thenReturn(new String[]{});
        // test
        String output = builder.run();
        // assert
        assertThat(output).isEqualTo("\n");
    }

    @Test
    public void run_with_option() {
        // prepare
        builder = makeMock("echo");
        when(builder.options(any())).thenReturn(new String[]{"test"});
        // test
        String output = builder.run();
        // assert
        assertThat(output).isEqualTo("test\n");
    }

    @Test
    public void run_failed() {
        // prepare
        builder = makeMock("dummy");
        when(builder.options(any())).thenReturn(new String[]{});
        // test
        String output = builder.run();
        // assert
        assertThat(output).isEmpty();
    }

    private SingleCommandLineToolBuilder makeMock(String command) {
        return mock(
                SingleCommandLineToolBuilder.class,
                Mockito.withSettings()
                        .defaultAnswer(Mockito.CALLS_REAL_METHODS)
                        .useConstructor(configuration, command)
        );
    }

}