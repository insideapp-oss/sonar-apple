package fr.insideapp.sonarqube.objectivec.lang.issues.oclint;

import fr.insideapp.sonarqube.objc.lang.issues.oclint.OCLintSensor;
import org.junit.Test;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class OCLintSensorTest {

    @Test
    public void describe() {

        SensorContextTester context = SensorContextTester.create(new File("."));
        OCLintSensor sensor = new OCLintSensor(context);
        DefaultSensorDescriptor descriptor = new DefaultSensorDescriptor();
        sensor.describe(descriptor);
        assertThat(descriptor.name()).isEqualTo("OCLint sensor");
    }
}
