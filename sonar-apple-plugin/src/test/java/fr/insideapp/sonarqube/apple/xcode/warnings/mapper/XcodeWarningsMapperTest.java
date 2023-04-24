package fr.insideapp.sonarqube.apple.xcode.warnings.mapper;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.xcode.warnings.models.XcodeWarning;
import fr.insideapp.sonarqube.apple.xcode.warnings.models.XcodeWarningLocation;
import fr.insideapp.sonarqube.apple.xcode.warnings.models.XcodeWarningType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public final class XcodeWarningsMapperTest {

    private XcodeWarningsMapper mapper;

    @Before
    public void prepare() {
        mapper = new XcodeWarningsMapper();
    }

    @Test
    public void map_oneWarning_noLocation() {
        // prepare
        XcodeWarning warning = new XcodeWarning(
            XcodeWarningType.NOTE,
            "This is a message",
            null
        );
        // test
        final Set<ReportIssue> issues = mapper.map(List.of(warning));
        // assert
        assertThat(issues).hasSize(0);
    }

    @Test
    public void map_oneWarning_withLocation() {
        // prepare
        XcodeWarning warning = new XcodeWarning(
            XcodeWarningType.NOTE,
            "This is a message",
            new XcodeWarningLocation(
                "/this/is/a/path",
                1
            )
        );
        // test
        final List<ReportIssue> issues = new ArrayList<>(mapper.map(List.of(warning)));
        // assert
        assertThat(issues).hasSize(1);
        ReportIssue issue = issues.get(0);
        assertThat(issue.getRuleId()).isEqualTo(warning.type.identifier);
        assertThat(issue.getMessage()).isEqualTo(warning.message);
        assertThat(issue.getFilePath()).isEqualTo(warning.location.filePath);
        assertThat(issue.getLineNumber()).isEqualTo(warning.location.lineNumber);
    }

}
