package fr.insideapp.sonarqube.objc.issues.oclint.interfaces;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.insideapp.sonarqube.objc.issues.oclint.models.OCLintReport;
import org.sonar.api.scanner.ScannerSide;

import java.io.File;

@ScannerSide
public interface OCLintExtractable {

    OCLintReport extract(File compileCommandsFolder) throws JsonProcessingException, Exception;

}
