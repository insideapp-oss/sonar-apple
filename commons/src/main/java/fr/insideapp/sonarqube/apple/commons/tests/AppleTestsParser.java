package fr.insideapp.sonarqube.apple.commons.tests;

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
        testSummaries.forEach(testSummary -> {
            testSummary.groups.forEach(group -> {
                LOGGER.info("Will report measure for path: {}", group.path);
                InputFile resource = getUnitTestResource(group.path);
                if (resource != null) {
                    LOGGER.info("Will report measure for file: {}", resource.absolutePath());
                    AppleTestClassReport classReport = new AppleTestClassReport(group);
                    save(classReport, resource);
                } else {
                    LOGGER.warn("Resource not found: {}", group.path);
                }
            });
        });
    }

    @CheckForNull
    private InputFile getUnitTestResource(String partialPath) {
        return TestFileFinders.getInstance().getUnitTestResource(context.fileSystem(), partialPath);
    }

    private void save(AppleTestClassReport report, InputFile inputFile) {
        int tests = report.getCount(AppleTestClassReport.Status.ALL) - report.getCount(AppleTestClassReport.Status.SKIPPED);
        saveMeasure(inputFile, CoreMetrics.SKIPPED_TESTS, report.getCount(AppleTestClassReport.Status.SKIPPED));
        saveMeasure(inputFile, CoreMetrics.TESTS, tests);
        saveMeasure(inputFile, CoreMetrics.TEST_FAILURES, report.getCount(AppleTestClassReport.Status.FAILED));
        saveMeasure(inputFile, CoreMetrics.TEST_EXECUTION_TIME, report.getDuration());
    }

    private <T extends Serializable> void saveMeasure(InputFile inputFile, Metric<T> metric, T value) {
        context.<T>newMeasure().forMetric(metric).on(inputFile).withValue(value).save();
    }

}
