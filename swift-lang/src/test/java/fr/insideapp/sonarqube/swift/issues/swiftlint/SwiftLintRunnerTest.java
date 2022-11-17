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
package fr.insideapp.sonarqube.swift.issues.swiftlint;

import fr.insideapp.sonarqube.swift.issues.swiftlint.runner.SwiftLintRunner;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.config.Configuration;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public final class SwiftLintRunnerTest {

    private SwiftLintRunner runner;
    private Class clazz;

    @Before
    public void prepare() {
        runner = new SwiftLintRunner(mock(Configuration.class));
        clazz = runner.getClass();
    }

    @Test
    public void options() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = runner.getClass();
        Method options = clazz.getDeclaredMethod("options", String.class);
        options.setAccessible(true);
        assertThat(options.invoke(runner, "source")).isEqualTo(new String[]{"lint", "--quiet", "--reporter", "json", "source"});
    }

    @Test
    public void exitCodes() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = runner.getClass();
        Method options = clazz.getDeclaredMethod("exitCodes");
        options.setAccessible(true);
        assertThat(options.invoke(runner)).isEqualTo(new Integer[]{0, 2});
    }

}
