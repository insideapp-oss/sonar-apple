package fr.insideapp.sonarqube.swift.lang.issues.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.issues.MobSFScanSensor;
import fr.insideapp.sonarqube.swift.lang.Swift;
import org.apache.commons.lang3.StringUtils;


public final class MobSFScanSwiftSensor extends MobSFScanSensor {

    @Override
    public String language() {
        return Swift.KEY;
    }

    @Override
    public String nameSuffix() {
        return String.format("for %s", StringUtils.capitalize(Swift.KEY));
    }
}
