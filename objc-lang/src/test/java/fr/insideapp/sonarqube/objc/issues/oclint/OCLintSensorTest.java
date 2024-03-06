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
package fr.insideapp.sonarqube.objc.issues.oclint;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssueRecorder;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.objc.issues.oclint.builder.OCLintJSONCompilationDatabaseBuildable;
import fr.insideapp.sonarqube.objc.issues.oclint.mapper.OCLintReportMappable;
import fr.insideapp.sonarqube.objc.issues.oclint.retriever.OCLintJSONCompilationDatabaseFolderRetrieverException;
import fr.insideapp.sonarqube.objc.issues.oclint.runner.OCLintRunnable;
import fr.insideapp.sonarqube.objc.issues.oclint.parser.OCLintReportParsable;
import fr.insideapp.sonarqube.objc.issues.oclint.retriever.OCLintJSONCompilationDatabaseFolderRetrievable;
import fr.insideapp.sonarqube.objc.issues.oclint.writer.OCLintJSONCompilationDatabaseWritable;
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
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class OCLintSensorTest {

    private static final String BASE_DIR = "/oclint";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private SensorContextTester context;
    private Configuration configuration;
    private ObjectiveC objectiveC;
    private OCLintJSONCompilationDatabaseFolderRetrievable retriever;
    private OCLintJSONCompilationDatabaseBuildable builder;
    private OCLintJSONCompilationDatabaseWritable writer;
    private OCLintRunnable runner;
    private OCLintReportParsable parser;
    private OCLintReportMappable mapper;
    private OCLintRulesDefinition rulesDefinition;
    private OCLintSensor sensor;

    @Before
    public void prepare() {
        retriever = mock(OCLintJSONCompilationDatabaseFolderRetrievable.class);
        builder = mock(OCLintJSONCompilationDatabaseBuildable.class);
        writer = mock(OCLintJSONCompilationDatabaseWritable.class);
        runner = mock(OCLintRunnable.class);
        parser = mock(OCLintReportParsable.class);
        mapper = mock(OCLintReportMappable.class);
        rulesDefinition = mock(OCLintRulesDefinition.class);
        context = SensorContextTester.create(baseDir);
        configuration = mock(Configuration.class);
        objectiveC = new ObjectiveC(configuration);
        sensor = new OCLintSensor(objectiveC,
                retriever, builder, writer,
                runner, parser, mapper,
                rulesDefinition,
                new ReportIssueRecorder()
        );
    }

    @Test
    public void describe() {
        // prepare
        DefaultSensorDescriptor defaultSensorDescriptor = new DefaultSensorDescriptor();
        // test
        sensor.describe(defaultSensorDescriptor);
        // assert
        assertThat(defaultSensorDescriptor.name()).isEqualTo("OCLint Sensor");
        assertThat(defaultSensorDescriptor.languages()).hasSize(1).containsOnly(objectiveC.getKey());
        assertThat(defaultSensorDescriptor.type()).isEqualTo(InputFile.Type.MAIN);
    }

    @Test
    public void execute_noJsonCompilationDatabaseFolder() throws OCLintJSONCompilationDatabaseFolderRetrieverException {
        // prepare
        when(retriever.retrieve()).thenThrow(new OCLintJSONCompilationDatabaseFolderRetrieverException("This is a message"));
        // test
        sensor.execute(context);
        // assert
        verify(builder, never()).build(any());
        verify(writer, never()).write(any());
        verify(runner, never()).run();
        verify(parser, never()).parse(any());
        verify(mapper, never()).map(any());
        verify(rulesDefinition, never()).getRepositoryKey();
        assertThat(context.allIssues()).isEmpty();
    }

    @Test
    public void execute_writeFailed() throws OCLintJSONCompilationDatabaseFolderRetrieverException {
        // prepare
        File jsonCompilationDatabaseFolder = new File("");
        when(retriever.retrieve()).thenReturn(jsonCompilationDatabaseFolder);
        when(builder.build(jsonCompilationDatabaseFolder)).thenReturn("test");
        when(writer.write("test")).thenReturn(false);
        // test
        sensor.execute(context);
        // assert
        verify(runner, never()).run();
        verify(parser, never()).parse(any());
        verify(mapper, never()).map(any());
        verify(rulesDefinition, never()).getRepositoryKey();
        assertThat(context.allIssues()).isEmpty();
    }

    @Test
    public void execute_noIssue() throws OCLintJSONCompilationDatabaseFolderRetrieverException {
        // prepare
        File jsonCompilationDatabaseFolder = new File("");
        when(retriever.retrieve()).thenReturn(jsonCompilationDatabaseFolder);
        when(builder.build(jsonCompilationDatabaseFolder)).thenReturn("test");
        when(writer.write("test")).thenReturn(true);
        when(runner.run()).thenReturn("output");
        when(parser.parse("output")).thenReturn(List.of());
        when(mapper.map(List.of())).thenReturn(Set.of());
        when(rulesDefinition.getRepositoryKey()).thenReturn("key");
        // test
        sensor.execute(context);
        // assert
        assertThat(context.allIssues()).isEmpty();
    }

    @Test
    public void execute_oneIssue() throws OCLintJSONCompilationDatabaseFolderRetrieverException {
        // prepare
        DefaultInputFile testFile = new TestInputFileBuilder("", "Greeting.m")
                .setModuleBaseDir(Paths.get(BASE_DIR))
                .setLanguage(objectiveC.getKey())
                .setLines(10)
                .setOriginalLineEndOffsets(new int[10])
                .setOriginalLineStartOffsets(new int[10])
                .build();
        ReportIssue issue = new ReportIssue(
                "short-variable-name",
                "Length of variable name `s` is 1, which is shorter than the threshold of 3",
                testFile.path().toString(),
                5
        );
        context.fileSystem().add(testFile);
        File jsonCompilationDatabaseFolder = new File("");
        when(retriever.retrieve()).thenReturn(jsonCompilationDatabaseFolder);
        when(builder.build(jsonCompilationDatabaseFolder)).thenReturn("test");
        when(writer.write("test")).thenReturn(true);
        when(runner.run()).thenReturn("output");
        when(parser.parse("output")).thenReturn(List.of());
        when(mapper.map(List.of())).thenReturn(Set.of(issue));
        when(rulesDefinition.getRepositoryKey()).thenReturn("key");
        // test
        sensor.execute(context);
        // assert
        List<Issue> issues = context.allIssues().stream().collect(Collectors.toList());
        assertThat(issues).hasSize(1);
        Issue issue1 = issues.get(0);
        assertThat(issue1.ruleKey().rule()).isEqualTo("short-variable-name");
        assertThat(issue1.primaryLocation().message()).isEqualTo("Length of variable name `s` is 1, which is shorter than the threshold of 3");
        assertThat(issue1.primaryLocation().inputComponent().key()).isEqualTo(":Greeting.m");
        assertThat(issue1.primaryLocation().textRange().start().line()).isEqualTo(5);
    }

}
