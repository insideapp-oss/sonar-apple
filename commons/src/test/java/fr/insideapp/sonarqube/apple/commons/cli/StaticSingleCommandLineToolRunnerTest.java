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

import org.junit.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class StaticSingleCommandLineToolRunnerTest {

    private StaticSingleCommandLineToolRunner runner;

    @Test
    public void run_no_option() {
        // prepare
        runner = makeMock("echo");
        when(runner.arguments()).thenReturn(new String[]{});
        // test
        String output = runner.run();
        // assert
        assertThat(output).isEqualTo("\n");
    }

    @Test
    public void run_with_option() {
        // prepare
        runner = makeMock("echo");
        when(runner.arguments()).thenReturn(new String[]{"test"});
        // test
        String output = runner.run();
        // assert
        assertThat(output).isEqualTo("test\n");
    }

    @Test
    public void run_failed() {
        // prepare
        runner = makeMock("dummy");
        when(runner.arguments()).thenReturn(new String[]{});
        // test
        String output = runner.run();
        // assert
        assertThat(output).isEmpty();
    }

    private StaticSingleCommandLineToolRunner makeMock(String command) {
        return mock(
                StaticSingleCommandLineToolRunner.class,
                Mockito.withSettings()
                        .defaultAnswer(Mockito.CALLS_REAL_METHODS)
                        .useConstructor(command)
        );
    }

}