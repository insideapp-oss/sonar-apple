package fr.insideapp.sonarqube.apple.xcode.warnings;

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import fr.insideapp.sonarqube.objc.issues.warnings.XcodeWarningObjectiveCRulesDefinition;
import fr.insideapp.sonarqube.swift.issues.warnings.XcodeWarningSwiftRulesDefinition;
import org.sonar.api.scanner.ScannerSide;

import java.util.Arrays;
import java.util.List;

@ScannerSide
public final class XcodeWarningExtensionProvider implements ExtensionProvider {

    public List<Object> extensions() {
        return Arrays.asList(
            XcodeWarningObjectiveCRulesDefinition.class,
            XcodeWarningSwiftRulesDefinition.class
        );
    }


}