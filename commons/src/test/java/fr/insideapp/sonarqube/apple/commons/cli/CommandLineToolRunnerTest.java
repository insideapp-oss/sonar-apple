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
package fr.insideapp.sonarqube.apple.commons.cli;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.sonar.api.config.Configuration;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.buildobjects.process.StartupException;

public final class CommandLineToolRunnerTest {

    private Configuration configuration;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
    }

    @Test
    public void exitCodes_default() {
        // prepare
        CommandLineToolRunner runner = makeMock("echo");
        // test
        Integer[] exitCodes = runner.exitCodes();
        // assert
        assertThat(exitCodes).hasSize(1).isEqualTo(new Integer[]{0});
    }

    @Test
    public void exitCodes_override() {
        // prepare
        CommandLineToolRunner runner = makeMock("echo");
        // prepare
        when(runner.exitCodes()).thenReturn(new Integer[]{1,2});
        // test
        Integer[] exitCodes = runner.exitCodes();
        // assert
        assertThat(exitCodes).hasSize(2).isEqualTo(new Integer[]{1,2});
    }

    @Test
    public void execute_no_option() throws Exception {
        // prepare
        CommandLineToolRunner runner = makeMock("echo");
        // test
        String output = runner.execute(new String[]{});
        // assert
        assertThat(output).isEqualTo("\n");
    }

    @Test
    public void execute_with_option() throws Exception {
        // prepare
        CommandLineToolRunner runner = makeMock("echo");
        // test
        String output = runner.execute(new String[]{"test"});
        // assert
        assertThat(output).isEqualTo("test\n");
    }

    @Test
    public void execute_should_throw() {
        // prepare
        CommandLineToolRunner runner = makeMock("dummy");
        // assert
        assertThatExceptionOfType(StartupException.class).isThrownBy(() -> {
            runner.execute(new String[]{});
        });
    }

    private CommandLineToolRunner makeMock(String command) {
        return mock(
                CommandLineToolRunner.class,
                Mockito.withSettings()
                        .defaultAnswer(Mockito.CALLS_REAL_METHODS)
                        .useConstructor(command)
        );
    }

}
