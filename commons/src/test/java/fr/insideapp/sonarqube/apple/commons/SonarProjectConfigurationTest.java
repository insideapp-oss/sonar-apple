package fr.insideapp.sonarqube.apple.commons;

import org.junit.Before;
import org.junit.Test;
import org.sonar.api.config.Configuration;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class SonarProjectConfigurationTest {

    private Configuration configuration;

    private SonarProjectConfiguration projectConfiguration;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
        projectConfiguration = new SonarProjectConfiguration(configuration);
    }

    @Test
    public void sources_not_specified() {
        // prepare
        when(configuration.getStringArray("sonar.sources")).thenReturn(new String[]{});
        // test
        List<String> sources = projectConfiguration.sources();
        // assert
        assertThat(sources).hasSize(0);
    }

    @Test
    public void sources_one_value() {
        // prepare
        when(configuration.getStringArray("sonar.sources")).thenReturn(new String[]{"source"});
        // test
        List<String> sources = projectConfiguration.sources();
        // assert
        assertThat(sources).hasSize(1);
        assertThat(sources.get(0)).isEqualTo("source");
    }

    @Test
    public void sources_many_values() {
        // prepare
        when(configuration.getStringArray("sonar.sources")).thenReturn(new String[]{"source1","source2"});
        // test
        List<String> sources = projectConfiguration.sources();
        // assert
        assertThat(sources).hasSize(2);
        assertThat(sources.get(0)).isEqualTo("source1");
        assertThat(sources.get(1)).isEqualTo("source2");
    }

}
