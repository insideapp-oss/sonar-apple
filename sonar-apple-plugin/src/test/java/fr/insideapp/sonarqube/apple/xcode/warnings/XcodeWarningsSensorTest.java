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
package fr.insideapp.sonarqube.apple.xcode.warnings;

import fr.insideapp.sonarqube.apple.XcodeResultExtensionProvider;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.warnings.XcodeWarningRulesDefinition;
import fr.insideapp.sonarqube.apple.xcode.runner.XcodeResultReadRunnable;
import fr.insideapp.sonarqube.apple.xcode.warnings.converter.XcodeWarningConvertible;
import fr.insideapp.sonarqube.apple.xcode.warnings.mapper.XcodeWarningsMapper;
import fr.insideapp.sonarqube.apple.xcode.warnings.parser.XcodeWarningParsable;
import fr.insideapp.sonarqube.apple.xcode.warnings.splitter.XcodeWarningsReportIssueSplittable;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.swift.Swift;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.issue.Issue;
import org.sonar.api.config.Configuration;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class XcodeWarningsSensorTest {

    private static final String BASE_DIR = "/xcode/warnings/sensor";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private XcodeWarningsSensor sensor;
    private Configuration configuration;
    private Swift swift;
    private ObjectiveC objectiveC;
    private SensorContextTester context;
    private XcodeResultReadRunnable runner;
    private XcodeWarningParsable parser;
    private XcodeWarningConvertible converter;
    private XcodeWarningsMapper mapper;
    private XcodeWarningsReportIssueSplittable splitter;
    private XcodeWarningRulesDefinition rulesDefinition;

    @Before
    public void prepare() {
        context = SensorContextTester.create(baseDir);
        configuration = mock(Configuration.class);
        swift = new Swift(configuration);
        objectiveC = new ObjectiveC();
        runner = mock(XcodeResultReadRunnable.class);
        parser = mock(XcodeWarningParsable.class);
        converter = mock(XcodeWarningConvertible.class);
        mapper = mock(XcodeWarningsMapper.class);
        splitter = mock(XcodeWarningsReportIssueSplittable.class);
        rulesDefinition = mock(XcodeWarningRulesDefinition.class);
        sensor = new XcodeWarningsSensor(
            swift,
            objectiveC,
            new XcodeResultExtensionProvider(),
            runner,
            parser,
            converter,
            mapper,
            splitter
        );
    }

    @Test
    public void describe() {
        // prepare
        DefaultSensorDescriptor defaultSensorDescriptor = new DefaultSensorDescriptor();
        // test
        sensor.describe(defaultSensorDescriptor);
        // assert
        assertThat(defaultSensorDescriptor.name()).isEqualTo("Xcode Warnings");
        assertThat(defaultSensorDescriptor.languages()).hasSize(2).containsOnly(swift.getKey(), objectiveC.getKey());
        assertThat(defaultSensorDescriptor.type()).isNull();
    }

    @Test
    public void execute_oneWarning() throws IOException {
        // prepare
        DefaultInputFile testFile = new TestInputFileBuilder("", "file.m")
            .setLines(100)
            .setOriginalLineEndOffsets(new int[100])
            .setOriginalLineStartOffsets(new int[100])
            .build();
        context.fileSystem().add(testFile);
        ReportIssue issue = new ReportIssue(
            "no-usage",
            "Immutable value 'x' was never used; consider replacing with '_' or removing it",
            testFile.path().toString(),
            12
        );
        File jsonFile = new File(baseDir, "one_warning.json");
        String jsonFileContent = FileUtils.readFileToString(jsonFile, Charset.defaultCharset());
        when(runner.run(any())).thenReturn(jsonFileContent);
        when(parser.parse(anyString())).thenReturn(List.of());
        when(converter.map(any())).thenReturn(Set.of());
        when(mapper.map(any())).thenReturn(Set.of(issue));
        when(splitter.split(any(), any())).thenReturn(Map.of(rulesDefinition, List.of(issue)));
        when(rulesDefinition.getRepositoryKey()).thenReturn("key");
        // test
        sensor.execute(context);
        // assert
        List<Issue> issues = new ArrayList<>(context.allIssues());
        assertThat(issues).hasSize(1);
        Issue issue1 = issues.get(0);
        assertThat(issue1.ruleKey().rule()).isEqualTo("no-usage");
        assertThat(issue1.primaryLocation().message()).isEqualTo("Immutable value 'x' was never used; consider replacing with '_' or removing it");
        assertThat(issue1.primaryLocation().inputComponent().key()).isEqualTo(":file.m");
        assertThat(issue1.primaryLocation().textRange().start().line()).isEqualTo(12);
    }

}
