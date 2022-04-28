package fr.insideapp.sonarqube.swift.lang.issues.mobsfscan;

import org.junit.Test;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;

import static org.assertj.core.api.Assertions.assertThat;

public class MobSFScanSwiftSensorTest {

    @Test
    public void describe() {
        MobSFScanSwiftSensor sensor = new MobSFScanSwiftSensor();
        DefaultSensorDescriptor descriptor = new DefaultSensorDescriptor();
        sensor.describe(descriptor);
        assertThat(descriptor.name()).isEqualTo("MobSFScan sensor for Swift");
    }

}
