package fr.insideapp.sonarqube.objectivec.lang.issues.mobsfscan;

import fr.insideapp.sonarqube.objc.lang.issues.mobsfscan.MobSFScanObjectiveCSensor;
import org.junit.Test;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;

import static org.assertj.core.api.Assertions.assertThat;

public class MobSFScanObjectiveCSensorTest {

    @Test
    public void describe() {
        MobSFScanObjectiveCSensor sensor = new MobSFScanObjectiveCSensor();
        DefaultSensorDescriptor descriptor = new DefaultSensorDescriptor();
        sensor.describe(descriptor);
        assertThat(descriptor.name()).isEqualTo("MobSFScan sensor for Objc");
    }

}
