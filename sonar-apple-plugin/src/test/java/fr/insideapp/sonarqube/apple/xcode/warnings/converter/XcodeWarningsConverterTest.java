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
package fr.insideapp.sonarqube.apple.xcode.warnings.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.insideapp.sonarqube.apple.xcode.warnings.models.XcodeWarning;
import fr.insideapp.sonarqube.apple.xcode.warnings.models.XcodeWarningLocation;
import fr.insideapp.sonarqube.apple.xcode.warnings.models.XcodeWarningType;
import fr.insideapp.sonarqube.apple.xcode.warnings.parser.models.WarningSummary;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static org.assertj.core.api.Assertions.assertThat;

public final class XcodeWarningsConverterTest {

    private static final String BASE_DIR = "/xcode/warnings/converter";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private XcodeWarningsConverter converter;
    private ObjectMapper objectMapper;


    @Before
    public void prepare() {
        converter = new XcodeWarningsConverter();
        objectMapper = new ObjectMapper().disable(FAIL_ON_UNKNOWN_PROPERTIES);
    }

    @Test
    public void convert_oneWarning_noLocation() throws IOException {
        // prepare
        File warningSummaryFile = new File(baseDir, "warningSummary_noLocation.json");
        String warningSummaryJSON = FileUtils.readFileToString(warningSummaryFile, Charset.defaultCharset());
        WarningSummary warningSummary = objectMapper.readValue(warningSummaryJSON, WarningSummary.class);
        // test
        final List<XcodeWarning> warnings = new ArrayList<>(converter.map(List.of(warningSummary)));
        // assert
        assertThat(warnings).hasSize(1);
        XcodeWarning warning = warnings.get(0);
        assertThat(warning.type).isEqualTo(XcodeWarningType.SWIFT_WARNING);
        assertThat(warning.message).isEqualTo("Comparing non-optional value of type 'UIView' to 'nil' always returns true");
        assertThat(warning.location).isNull();
    }

    @Test
    public void convert_oneWarning_withLocation() throws IOException {
        // prepare
        File warningSummaryFile = new File(baseDir, "warningSummary_withLocation.json");
        String warningSummaryJSON = FileUtils.readFileToString(warningSummaryFile, Charset.defaultCharset());
        WarningSummary warningSummary = objectMapper.readValue(warningSummaryJSON, WarningSummary.class);
        // test
        final List<XcodeWarning> warnings = new ArrayList<>(converter.map(List.of(warningSummary)));
        // assert
        assertThat(warnings).hasSize(1);
        XcodeWarning warning = warnings.get(0);
        assertThat(warning.type).isEqualTo(XcodeWarningType.SWIFT_WARNING);
        assertThat(warning.message).isEqualTo("Comparing non-optional value of type 'UIView' to 'nil' always returns true");
        assertThat(warning.location).isNotNull();
        XcodeWarningLocation location = warning.location;
        assertThat(location.filePath).isEqualTo("/path/to/file/TestObjectiveC.m");
        assertThat(location.lineNumber).isEqualTo(14);
    }

    @Test
    public void convert_oneWarning_missingLineNumber() throws IOException {
        // prepare
        File warningSummaryFile = new File(baseDir, "warningSummary_missingLineNumber.json");
        String warningSummaryJSON = FileUtils.readFileToString(warningSummaryFile, Charset.defaultCharset());
        WarningSummary warningSummary = objectMapper.readValue(warningSummaryJSON, WarningSummary.class);
        // test
        final List<XcodeWarning> warnings = new ArrayList<>(converter.map(List.of(warningSummary)));
        // assert
        assertThat(warnings).hasSize(1);
        XcodeWarning warning = warnings.get(0);
        assertThat(warning.type).isEqualTo(XcodeWarningType.SWIFT_WARNING);
        assertThat(warning.message).isEqualTo("Comparing non-optional value of type 'UIView' to 'nil' always returns true");
        assertThat(warning.location).isNull();
    }

    @Test
    public void convert_oneWarning_missingFilePath() throws IOException {
        // prepare
        File warningSummaryFile = new File(baseDir, "warningSummary_missingFilePath.json");
        String warningSummaryJSON = FileUtils.readFileToString(warningSummaryFile, Charset.defaultCharset());
        WarningSummary warningSummary = objectMapper.readValue(warningSummaryJSON, WarningSummary.class);
        // test
        final List<XcodeWarning> warnings = new ArrayList<>(converter.map(List.of(warningSummary)));
        // assert
        assertThat(warnings).hasSize(1);
        XcodeWarning warning = warnings.get(0);
        assertThat(warning.type).isEqualTo(XcodeWarningType.SWIFT_WARNING);
        assertThat(warning.message).isEqualTo("Comparing non-optional value of type 'UIView' to 'nil' always returns true");
        assertThat(warning.location).isNull();
    }

}