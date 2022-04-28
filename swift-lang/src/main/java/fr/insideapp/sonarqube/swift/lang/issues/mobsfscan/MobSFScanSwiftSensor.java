package fr.insideapp.sonarqube.swift.lang.issues.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.issues.MobSFScanSensor;
import fr.insideapp.sonarqube.swift.lang.Swift;


public final class MobSFScanSwiftSensor extends MobSFScanSensor {

    @Override
    public String language() {
        return Swift.KEY;
    }
}
