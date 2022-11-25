package fr.insideapp.sonarqube.apple.mobsfscan;

import fr.insideapp.sonarqube.apple.mobsfscan.models.MobSFScanIssue;
import fr.insideapp.sonarqube.apple.mobsfscan.models.MobSFScanReportResultLocation;
import fr.insideapp.sonarqube.apple.mobsfscan.parser.MobSFScanReportParser;
import fr.insideapp.sonarqube.swift.issues.periphery.models.PeripheryIssue;
import fr.insideapp.sonarqube.swift.issues.periphery.parser.PeripheryReportParser;
import org.apache.commons.io.FileUtils;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class MobSFScanReportParserTest {

    private static class Container {
        final String reportFileName;
        final List<Vulnerability> vulnerabilities;
        public Container(String reportFileName, List<Vulnerability> vulnerabilities) {
            this.reportFileName = reportFileName;
            this.vulnerabilities = vulnerabilities;
        }
    }

    private static class Vulnerability {
        final String rule;

        final List<Location> locations;

        public Vulnerability(String rule, List<Location> locations) {
            this.rule = rule;
            this.locations = locations;
        }
    }

    private static class Location {
        final String path;

        final int line;

        public Location(String path, int line) {
            this.path = path;
            this.line = line;
        }
    }

    private static final String BASE_DIR = "/mobsfscan";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private MobSFScanReportParser parser;

    @Before
    public void prepare() {
        parser = new MobSFScanReportParser();
    }

    @Test
    public void parse_empty() throws IOException {
        assertContainer(new Container(
                "empty.json",
                new ArrayList<>()
        ));
    }

    @Test
    public void parse_invalid_empty() throws IOException {
        assertContainer(new Container(
                "invalid.json",
                new ArrayList<>()
        ));
    }

    @Test
    public void parse_no_file() throws IOException {
        List<Vulnerability> vulnerabilities = new ArrayList<>() {
            {
                add(new Vulnerability(
                        "ios_detect_jailbreak_check",
                        new ArrayList<>()
                ));
            }
        };
        assertContainer(new Container(
                "issue_no_file.json",
                vulnerabilities
        ));
    }

    @Test
    public void parse_files() throws IOException {
        List<Location> locations = new ArrayList<>() {
            {
                add(new Location("path/to/file.swift", 15));
                add(new Location("path/to/another/file.swift", 16));
            }
        };
        List<Vulnerability> vulnerabilities = new ArrayList<>() {
            {
                add(new Vulnerability(
                        "ios_log",
                        locations
                ));
            }
        };
        assertContainer(new Container(
                "issue_files.json",
                vulnerabilities
        ));
    }

    private void assertContainer(Container container) throws IOException {
        // Data setup
        File jsonFile = new File(baseDir, container.reportFileName);
        String jsonFileContent = FileUtils.readFileToString(jsonFile, Charset.defaultCharset());

        // Running our code
        List<MobSFScanIssue> mobSFScanIssues = parser.parse(jsonFileContent);

        // Asserting
        assertThat(mobSFScanIssues).hasSize(container.vulnerabilities.size());

        for (int i = 0; i < mobSFScanIssues.size(); i++) {
            MobSFScanIssue issue = mobSFScanIssues.get(i);
            Vulnerability vulnerability = container.vulnerabilities.get(i);
            assertThat(issue.rule).isEqualTo(vulnerability.rule);
            assertThat(issue.locations).hasSize(vulnerability.locations.size());
            for (int j = 0; j < issue.locations.size(); j++) {
                MobSFScanReportResultLocation issueLocation = issue.locations.get(j);
                Location location = vulnerability.locations.get(j);
                assertThat(issueLocation.path).isEqualTo(location.path);
                assertThat(issueLocation.lines.get(0)).isEqualTo(location.line);
            }
        }
    }

}
