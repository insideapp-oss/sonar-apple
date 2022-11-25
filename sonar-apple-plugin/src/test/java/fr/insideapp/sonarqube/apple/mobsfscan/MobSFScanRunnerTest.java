package fr.insideapp.sonarqube.apple.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.SonarProjectConfiguration;
import fr.insideapp.sonarqube.apple.mobsfscan.runner.MobSFScanRunner;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class MobSFScanRunnerTest {

    private MobSFScanRunner runner;

    private SonarProjectConfiguration sonarProjectConfiguration;
    private Class<? extends MobSFScanRunner> clazz;

    @Before
    public void prepare() {
        sonarProjectConfiguration = mock(SonarProjectConfiguration.class);
        runner = new MobSFScanRunner(sonarProjectConfiguration);
        clazz = runner.getClass();
    }

    @Test
    public void one_source() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("options");
        options.setAccessible(true);
        mockSources(List.of("source1"));
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "--json",
                "source1"
        });
    }

    @Test
    public void many_sources() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("options");
        options.setAccessible(true);
        mockSources(List.of("source1", "source2"));
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "--json",
                "source1", "source2"
        });
    }

    // Private

    private void mockSources(List<String> values) {
        when(sonarProjectConfiguration.sources()).thenReturn(values);
    }

}
