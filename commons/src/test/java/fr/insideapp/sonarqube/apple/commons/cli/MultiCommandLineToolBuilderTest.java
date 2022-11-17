package fr.insideapp.sonarqube.apple.commons.cli;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.sonar.api.config.Configuration;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class MultiCommandLineToolBuilderTest {

    private MultiCommandLineToolBuilder builder;

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
        List<String> outputs = builder.run();
        // assert
        assertThat(outputs).hasSize(1);
        assertThat(outputs.get(0)).isEqualTo("\n");
    }

    @Test
    public void run_with_option() {
        // prepare
        builder = makeMock("echo");
        when(builder.options(any())).thenReturn(new String[]{"test"});
        // test
        List<String> outputs = builder.run();
        // assert
        assertThat(outputs).hasSize(1);
        assertThat(outputs.get(0)).isEqualTo("test\n");
    }

    @Test
    public void run_with_sources_and_option() {
        // prepare
        builder = makeMock("echo");
        when(configuration.get(any())).thenReturn(Optional.of("source1,source2"));
        when(builder.options(any())).thenAnswer(source -> new String[]{source.getArgument(0, String.class)});
        // test
        List<String> outputs = builder.run();
        // assert
        assertThat(outputs).hasSize(2);
        assertThat(outputs.get(0)).isEqualTo("source1\n");
        assertThat(outputs.get(1)).isEqualTo("source2\n");
    }

    @Test
    public void run_failed() {
        // prepare
        builder = makeMock("dummy");
        when(builder.options(any())).thenReturn(new String[]{});
        // test
        List<String> outputs = builder.run();
        // assert
        assertThat(outputs).isEmpty();
    }

    private MultiCommandLineToolBuilder makeMock(String command) {
        return mock(
                MultiCommandLineToolBuilder.class,
                Mockito.withSettings()
                        .defaultAnswer(Mockito.CALLS_REAL_METHODS)
                        .useConstructor(configuration, command)
        );
    }

}
