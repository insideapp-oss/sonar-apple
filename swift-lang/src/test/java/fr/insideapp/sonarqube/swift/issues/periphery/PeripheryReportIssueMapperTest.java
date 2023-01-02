/*
 * SonarQube Apple Plugin - Enables analysis of Swift and Objective-C projects into SonarQube.
 * Copyright © 2022 inside|app (contact@insideapp.fr)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.insideapp.sonarqube.swift.issues.periphery;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.swift.issues.periphery.mapper.PeripheryReportMapper;
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

    private PeripheryReportMapper mapper;

    @Before
    public void prepare() {
        mapper = new PeripheryReportMapper();
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
