package fr.insideapp.sonarqube.swift.lang.issues.periphery;

import org.junit.Test;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class PeripherySensorTest {

    private static final String BASE_DIR = "src/test/resources/swift";

    @Test
    public void describe() {
        PeripherySensor sensor = new PeripherySensor(SensorContextTester.create(new File(BASE_DIR)));
        DefaultSensorDescriptor descriptor = new DefaultSensorDescriptor();
        sensor.describe(descriptor);
        assertThat(descriptor.name()).isEqualTo("Periphery Sensor");
    }

}
