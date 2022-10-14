package fr.insideapp.sonarqube.apple.commons.tests;

import fr.insideapp.sonarqube.apple.commons.tests.models.AppleTestClassReport;
import fr.insideapp.sonarqube.apple.commons.tests.models.AppleTestGroup;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import javax.annotation.CheckForNull;
import java.io.Serializable;
import java.util.List;

public class AppleTestsParser {

    private static final Logger LOGGER = Loggers.get(AppleTestsParser.class);

    private final SensorContext context;

    public AppleTestsParser(SensorContext context) {
        this.context = context;
    }

    public void collect(List<AppleTestSummary> testSummaries) {
        LOGGER.info("{} test report(s) to handle", testSummaries.size());
        testSummaries.forEach(testSummary -> {
            LOGGER.info("{} test group(s) to report", testSummary.groups.size());
            testSummary.groups.forEach(group -> {
                LOGGER.debug("Collecting data for {} ({})", group.name, group.bundle);
                InputFile resource = getUnitTestResource(group);
                if (resource != null) {
                    AppleTestClassReport classReport = new AppleTestClassReport(group);
                    save(classReport, resource);
                } else {
                    LOGGER.warn("Resource not found for bundle {} and class {}", group.bundle, group.name);
                    LOGGER.warn("Make sure the class {} is located inside {} folder (nesting allowed)", group.bundle);
                    LOGGER.warn("Make sure the bundle {} matches its folder name", group.bundle);
                    LOGGER.warn("Make sure the class {} matches its file name", group.name);
                }
            });
        });
    }

    @CheckForNull
    private InputFile getUnitTestResource(AppleTestGroup group) {
        return TestFileFinders.getInstance().getUnitTestResource(context.fileSystem(), group.bundle, group.name);
    }

    private void save(AppleTestClassReport report, InputFile inputFile) {
        int allTests = report.getCount(AppleTestClassReport.Status.ALL);
        LOGGER.debug("{} test(s) found for {}", allTests, inputFile.absolutePath());
        int skippedTests = report.getCount(AppleTestClassReport.Status.SKIPPED);
        saveMeasure(inputFile, CoreMetrics.TESTS, allTests - skippedTests);
        saveMeasure(inputFile, CoreMetrics.SKIPPED_TESTS, skippedTests);
        saveMeasure(inputFile, CoreMetrics.TEST_FAILURES, report.getCount(AppleTestClassReport.Status.FAILED));
        saveMeasure(inputFile, CoreMetrics.TEST_EXECUTION_TIME, report.getDuration());
    }

    private <T extends Serializable> void saveMeasure(InputFile inputFile, Metric<T> metric, T value) {
        context.<T>newMeasure().forMetric(metric).on(inputFile).withValue(value).save();
    }

}
