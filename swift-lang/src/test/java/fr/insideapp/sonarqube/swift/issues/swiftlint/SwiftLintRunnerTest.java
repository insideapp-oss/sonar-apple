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
