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
package fr.insideapp.sonarqube.apple.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.issues.MobSFScanRulesDefinition;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.mobsfscan.mapper.MobSFScanReportMappable;
import fr.insideapp.sonarqube.apple.mobsfscan.parser.MobSFScanReportParsable;
import fr.insideapp.sonarqube.apple.mobsfscan.runner.MobSFScanRunnable;
import fr.insideapp.sonarqube.apple.mobsfscan.splitter.MobSFScanReportIssueSplittable;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.swift.Swift;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.issue.Issue;

import java.io.File;
import java.nio.file.Paths;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class MobSFScanSensorTest {

    private static final String BASE_DIR = "/mobsfscan";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private MobSFScanSensor sensor;
    private Swift swift;
    private ObjectiveC objectiveC;
    private SensorContextTester context;
    private MobSFScanRunnable runner;
    private MobSFScanReportParsable parser;
    private MobSFScanReportMappable mapper;
    private MobSFScanReportIssueSplittable splitter;

    private MobSFScanRulesDefinition rulesDefinition;

    @Before
    public void prepare() {
        context = SensorContextTester.create(baseDir);
        runner = mock(MobSFScanRunnable.class);
        parser = mock(MobSFScanReportParsable.class);
        mapper = mock(MobSFScanReportMappable.class);
        splitter = mock(MobSFScanReportIssueSplittable.class);
        rulesDefinition = mock(MobSFScanRulesDefinition.class);
        swift = new Swift();
        objectiveC = new ObjectiveC();
        sensor = new MobSFScanSensor(
                swift,
                objectiveC,
                runner,
                parser,
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
        assertThat(defaultSensorDescriptor.name()).isEqualTo("MobSFScan Sensor");
        assertThat(defaultSensorDescriptor.languages()).hasSize(2).containsOnly(swift.getKey(), objectiveC.getKey());
        assertThat(defaultSensorDescriptor.type()).isEqualTo(InputFile.Type.MAIN);
    }

    @Test
    public void execute_noIssue() {
        // prepare
        when(runner.run()).thenReturn("[]");
        when(parser.parse(anyString())).thenReturn(List.of());
        when(mapper.map(any())).thenReturn(Set.of());
        when(splitter.split(any(), any())).thenReturn(Map.of());
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
                .setLanguage(swift.getKey())
                .setLines(10)
                .setOriginalLineEndOffsets(new int[10])
                .setOriginalLineStartOffsets(new int[10])
                .build();
        ReportIssue issue = new ReportIssue(
                "ios_sha1_collision",
                null,
                testFile.path().toString(),
                5
        );
        context.fileSystem().add(testFile);
        when(runner.run()).thenReturn("[]");
        when(parser.parse(anyString())).thenReturn(List.of());
        when(mapper.map(any())).thenReturn(Set.of(issue));
        when(splitter.split(any(), any())).thenReturn(Map.of(rulesDefinition, List.of(issue)));
        when(rulesDefinition.getRepositoryKey()).thenReturn("key");
        // test
        sensor.execute(context);
        // assert
        List<Issue> issues = new ArrayList<>(context.allIssues());
        assertThat(issues).hasSize(1);
        Issue issue1 = issues.get(0);
        assertThat(issue1.ruleKey().rule()).isEqualTo("ios_sha1_collision");
        assertThat(issue1.primaryLocation().message()).isNull();;
        assertThat(issue1.primaryLocation().inputComponent().key()).isEqualTo(":Greeting.swift");
        assertThat(issue1.primaryLocation().textRange().start().line()).isEqualTo(5);
    }

}
