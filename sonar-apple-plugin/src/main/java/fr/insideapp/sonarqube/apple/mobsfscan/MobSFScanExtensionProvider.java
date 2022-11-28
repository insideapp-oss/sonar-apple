package fr.insideapp.sonarqube.apple.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import fr.insideapp.sonarqube.apple.mobsfscan.mapper.MobSFScanReportIssueMapper;
import fr.insideapp.sonarqube.apple.mobsfscan.parser.MobSFScanReportParser;
import fr.insideapp.sonarqube.apple.mobsfscan.runner.MobSFScanRunner;
import fr.insideapp.sonarqube.apple.mobsfscan.splitter.MobSFScanReportIssueSplitter;
import fr.insideapp.sonarqube.objc.issues.mobsfscan.MobSFScanObjectiveCRulesDefinition;
import fr.insideapp.sonarqube.swift.issues.mobsfscan.MobSFScanSwiftRulesDefinition;
import org.sonar.api.scanner.ScannerSide;

import java.util.Arrays;
import java.util.List;

@ScannerSide
public final class MobSFScanExtensionProvider implements ExtensionProvider {

    public List<Object> extensions() {
        return Arrays.asList(
                MobSFScanSwiftRulesDefinition.class,
                MobSFScanObjectiveCRulesDefinition.class,
                MobSFScanRunner.class,
                MobSFScanReportParser.class,
                MobSFScanReportIssueMapper.class,
                MobSFScanReportIssueSplitter.class,
                MobSFScanSensor.class
        );
    }


}