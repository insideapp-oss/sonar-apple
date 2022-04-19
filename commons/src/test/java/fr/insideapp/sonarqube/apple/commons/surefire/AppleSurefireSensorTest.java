package fr.insideapp.sonarqube.apple.commons.surefire;

import fr.insideapp.sonaqube.apple.commons.surefire.AppleSurefireSensor;
import org.junit.Test;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class AppleSurefireSensorTest {

    @Test
    public void describe() {

        SensorContext context = mock(SensorContext.class);

        AppleSurefireSensor sensor = new AppleSurefireSensor(context);
        DefaultSensorDescriptor defaultSensorDescriptor = new DefaultSensorDescriptor();
        sensor.describe(defaultSensorDescriptor);
        assertThat(defaultSensorDescriptor.languages()).containsOnly("swift", "objc");
    }
}
