package fr.insideapp.sonarqube.apple.commons.tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.insideapp.sonarqube.apple.commons.coverage.AppleCoverageParser;
import fr.insideapp.sonarqube.apple.commons.tests.old.UnitTestClassReport;
import org.json.JSONObject;
import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.Serializable;
import java.util.List;

public class AppleTestsParser {

    private static final Logger LOGGER = Loggers.get(AppleTestsParser.class);

    private final SensorContext context;

    public AppleTestsParser(SensorContext context) {
        this.context = context;
    }

    public void collect(List<AppleTestSummary> testSummaries) {
        testSummaries.forEach(testSummary -> {
            testSummary.groups.forEach(group -> {
                // get InputFile from group.name else skip
                AppleTestClassReport classReport = new AppleTestClassReport(group);
                // call save(report, file)
            });
        });
    }

    /*private void save(AppleTestGroup group, InputFile inputFile) {
        int testsCount = report.getTests() - report.getSkipped();
        saveMeasure(inputFile, CoreMetrics.SKIPPED_TESTS, report.getSkipped());
        saveMeasure(inputFile, CoreMetrics.TESTS, testsCount);
        saveMeasure(inputFile, CoreMetrics.TEST_ERRORS, report.getErrors());
        saveMeasure(inputFile, CoreMetrics.TEST_FAILURES, report.getFailures());
        saveMeasure(inputFile, CoreMetrics.TEST_EXECUTION_TIME, report.getDurationMilliseconds());
    }*/

    private <T extends Serializable> void saveMeasure(InputFile inputFile, Metric<T> metric, T value) {
        context.<T>newMeasure().forMetric(metric).on(inputFile).withValue(value).save();
    }

}
