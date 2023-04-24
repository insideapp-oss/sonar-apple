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
