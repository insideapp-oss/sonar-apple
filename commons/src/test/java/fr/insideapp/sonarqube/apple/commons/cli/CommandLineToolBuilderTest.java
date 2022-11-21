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

import org.buildobjects.process.ProcBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.sonar.api.config.Configuration;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class CommandLineToolBuilderTest {

    private static String COMMAND = "COMMAND";

    private CommandLineToolBuilder builder;

    private Configuration configuration;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
        builder = mock(
                CommandLineToolBuilder.class,
                Mockito.withSettings()
                        .defaultAnswer(Mockito.CALLS_REAL_METHODS)
                        .useConstructor(configuration, COMMAND)
        );
    }

    @Test
    public void exitCodes_default() {
        // test
        Integer[] exitCodes = builder.exitCodes();
        // assert
        assertThat(exitCodes).hasSize(1);
        assertThat(exitCodes).isEqualTo(new Integer[]{0});
    }

    @Test
    public void exitCodes_override() {
        // prepare
        when(builder.exitCodes()).thenReturn(new Integer[]{1,2});
        // test
        Integer[] exitCodes = builder.exitCodes();
        // assert
        assertThat(exitCodes).hasSize(2);
        assertThat(exitCodes).isEqualTo(new Integer[]{1,2});
    }

    @Test
    public void sources_not_specified() {
        // prepare
        when(configuration.get(anyString())).thenReturn(Optional.empty());
        // test
        List<String> sources = builder.sources();
        // assert
        assertThat(sources).hasSize(1);
        assertThat(sources.get(0)).isEqualTo(".");
    }

    @Test
    public void sources_one_value() {
        // prepare
        when(configuration.get(anyString())).thenReturn(Optional.of("source"));
        // test
        List<String> sources = builder.sources();
        // assert
        assertThat(sources).hasSize(1);
        assertThat(sources.get(0)).isEqualTo("source");
    }

    @Test
    public void sources_many_values() {
        // prepare
        when(configuration.get(anyString())).thenReturn(Optional.of("source1,source2"));
        // test
        List<String> sources = builder.sources();
        // assert
        assertThat(sources).hasSize(2);
        assertThat(sources.get(0)).isEqualTo("source1");
        assertThat(sources.get(1)).isEqualTo("source2");
    }

    @Test
    public void build_no_option() {
        // test
        ProcBuilder procBuilder = builder.build(new String[]{});
        // assert
        assertThat(procBuilder.getCommandLine()).isEqualTo(COMMAND + " ");
    }

    @Test
    public void build_with_options() {
        // test
        ProcBuilder procBuilder = builder.build(new String[]{"option1", "option2"});
        // assert
        assertThat(procBuilder.getCommandLine()).isEqualTo(COMMAND + " option1 option2");
    }

}
