package fr.insideapp.sonarqube.objc.lang.issues.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.issues.MobSFScanSensor;
import fr.insideapp.sonarqube.objc.lang.ObjectiveC;
import org.apache.commons.lang3.StringUtils;

public final class MobSFScanObjectiveCSensor extends MobSFScanSensor {

    @Override
    public String language() {
        return ObjectiveC.KEY;
    }

    @Override
    public String nameSuffix() {
        return String.format("for %s", StringUtils.capitalize(ObjectiveC.KEY));
    }
}