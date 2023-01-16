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
import fr.insideapp.sonarqube.swift.Swift;
import fr.insideapp.sonarqube.swift.issues.periphery.mapper.PeripheryReportIssueMappable;
import fr.insideapp.sonarqube.swift.issues.periphery.parser.PeripheryReportParsable;
import fr.insideapp.sonarqube.swift.issues.periphery.runner.PeripheryRunnable;
import fr.insideapp.sonarqube.swift.issues.swiftlint.SwiftLintSensor;
import fr.insideapp.sonarqube.swift.issues.swiftlint.mapper.SwiftLintReportIssueMappable;
import fr.insideapp.sonarqube.swift.issues.swiftlint.parser.SwiftLintReportParsable;
import fr.insideapp.sonarqube.swift.issues.swiftlint.runner.SwiftLintRunnable;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.issue.Issue;
import org.sonar.api.config.Configuration;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class PeripherySensorTest {

    private static final String BASE_DIR = "/swift/periphery";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private PeripherySensor sensor;
    private SensorContextTester context;
    private PeripheryRunnable runner;
    private PeripheryReportParsable parser;
    private PeripheryReportIssueMappable mapper;

    @Before
    public void prepare() {
        context = SensorContextTester.create(baseDir);
        runner = mock(PeripheryRunnable.class);
        parser = mock(PeripheryReportParsable.class);
        mapper = mock(PeripheryReportIssueMappable.class);
        sensor = new PeripherySensor(
                runner,
                parser,
                mapper
        );
    }

    @Test
    public void describe() {
        // prepare
        DefaultSensorDescriptor defaultSensorDescriptor = new DefaultSensorDescriptor();
        // test
        sensor.describe(defaultSensorDescriptor);
        // assert
        assertThat(defaultSensorDescriptor.name()).isEqualTo("Periphery Sensor");
        assertThat(defaultSensorDescriptor.languages()).hasSize(1);
        assertThat(defaultSensorDescriptor.languages()).element(0).isEqualTo(Swift.KEY);
        assertThat(defaultSensorDescriptor.type()).isEqualTo(InputFile.Type.MAIN);
    }

    @Test
    public void execute_noIssue() {
        // prepare
        when(runner.run()).thenReturn("[]");
        when(parser.parse(anyString())).thenReturn(List.of());
        when(mapper.map(any())).thenReturn(Set.of());
        // test
        sensor.execute(context);
        // assert
        assertThat(context.allIssues()).isEmpty();
    }

    @Test
    public void execute_oneIssue() {
        // prepare
        DefaultInputFile testFile = new TestInputFileBuilder("", "Greeting.swift")
                .setModuleBaseDir(Paths.get(BASE_DIR))
                .setLanguage(Swift.KEY)
                .setLines(10)
                .setOriginalLineEndOffsets(new int[10])
                .setOriginalLineStartOffsets(new int[10])
                .build();
        ReportIssue issue = new ReportIssue(
                "unused",
                null,
                testFile.path().toString(),
                5
        );
        context.fileSystem().add(testFile);
        when(runner.run()).thenReturn("[]");
        when(parser.parse(anyString())).thenReturn(List.of());
        when(mapper.map(any())).thenReturn(Set.of(issue));
        // test
        sensor.execute(context);
        // assert
        List<Issue> issues = new ArrayList<>(context.allIssues());
        assertThat(issues).hasSize(1);
        Issue issue1 = issues.get(0);
        assertThat(issue1.ruleKey().rule()).isEqualTo("unused");
        assertThat(issue1.primaryLocation().message()).isNull();
        assertThat(issue1.primaryLocation().inputComponent().key()).isEqualTo(":Greeting.swift");
        assertThat(issue1.primaryLocation().textRange().start().line()).isEqualTo(5);
    }

}
