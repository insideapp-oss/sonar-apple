package fr.insideapp.sonarqube.swift.issues.periphery;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.swift.issues.periphery.mapper.PeripheryReportIssueMapper;
import fr.insideapp.sonarqube.swift.issues.periphery.models.PeripheryIssue;
import fr.insideapp.sonarqube.swift.issues.periphery.models.PeripheryIssueLocation;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public final class PeripheryReportIssueMapperTest {

    private PeripheryReportIssueMapper mapper;

    @Before
    public void prepare() {
        mapper = new PeripheryReportIssueMapper();
    }

    @Test
    public void map() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // prepare
        Constructor<PeripheryIssueLocation> locationConstructor = PeripheryIssueLocation.class
                .getDeclaredConstructor(String.class, Integer.class);
        locationConstructor.setAccessible(true);
        PeripheryIssueLocation location = locationConstructor.newInstance("path/to/the/file", 18);
        PeripheryIssue issue = PeripheryIssue.class.getDeclaredConstructor().newInstance();
        issue.ruleIdentifier = "rule-id";
        issue.location = location;
        // test
        Set<ReportIssue> reportIssues = mapper.map(List.of(issue));
        // assert
        List<ReportIssue> reportIssuesList = new ArrayList<>(reportIssues);
        assertThat(reportIssuesList).hasSize(1);
        ReportIssue reportIssue = reportIssuesList.get(0);
        assertThat(reportIssue.getRuleId()).isEqualTo("rule-id");
        assertThat(reportIssue.getMessage()).isNull();
        assertThat(reportIssue.getFilePath()).isEqualTo("path/to/the/file");
        assertThat(reportIssue.getLineNumber()).isEqualTo(18);
    }

}
