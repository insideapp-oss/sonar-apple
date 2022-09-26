package fr.insideapp.sonarqube.apple.commons.coverage;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.coverage.NewCoverage;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XCCovReportParser {

    private static final Logger LOGGER = Loggers.get(XCCovReportParser.class);

    private final SensorContext context;

    public XCCovReportParser(SensorContext context) {
        this.context = context;
    }

    public void collect(Map<String, String> coverageData) {

        Pattern pattern = Pattern.compile("^ *(\\d+): (\\d+).*$");

        coverageData.forEach((filePath, fileCoverage) -> {

            InputFile resource = getFile(filePath);
            if (resource == null) {
                // skipping coverage for this file, since it's unknown
                return;
            }

            // building the new coverage object
            NewCoverage coverage = context.newCoverage();
            coverage.onFile(resource);

            String[] coveragePerLine = fileCoverage.split(System.getProperty("line.separator"));
            for (String line : coveragePerLine) {

                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    int lineNum = safeIntegerParse(matcher.group(1));
                    int hitsCount = safeIntegerParse(matcher.group(2));
                    // we got the coverage
                    coverage.lineHits(lineNum, hitsCount);
                }
            }

            // saving!
            coverage.save();

        });

    }

    private int safeIntegerParse(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return Integer.MAX_VALUE;
        }
    }

    private InputFile getFile(String filePath) {
        FilePredicate fp = context.fileSystem().predicates().hasPath(filePath);
        if(context.fileSystem().hasFiles(fp)) {
            return context.fileSystem().inputFile(fp);
        } else {
            LOGGER.warn("Can't find file {}", filePath);
            return null;
        }
    }
}