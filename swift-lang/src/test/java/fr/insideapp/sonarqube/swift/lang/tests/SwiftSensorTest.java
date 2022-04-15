package fr.insideapp.sonarqube.swift.lang.tests;

import fr.insideapp.sonarqube.swift.lang.SwiftSensor;
import org.junit.Test;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class SwiftSensorTest {
    @Test
    public void describe() {
        SensorContextTester context = SensorContextTester.create(new File("."));
        SwiftSensor sensor = new SwiftSensor(context);
        DefaultSensorDescriptor descriptor = new DefaultSensorDescriptor();
        sensor.describe(descriptor);
        assertThat(descriptor.name()).isEqualTo("Swift Sensor");
    }

    @Test
    public void execute() {
        SensorContextTester context = SensorContextTester.create(new File("."));
        SwiftSensor sensor = new SwiftSensor(context);
        assertThatCode(() -> {
            sensor.execute(context);
        }).doesNotThrowAnyException();
        assertThat(context.allIssues()).isEmpty();
    }
}
