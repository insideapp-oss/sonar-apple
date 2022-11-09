package fr.insideapp.sonarqube.objc.issues.oclint;

import org.json.JSONArray;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class OCLintJSONDatabaseBuilderTest {

    private static class Container {
        final String jsonCompilationDatabasePath;
        final int size;

        public Container(String jsonCompilationDatabasePath, int size) {
            this.jsonCompilationDatabasePath = jsonCompilationDatabasePath;
            this.size = size;
        }
    }

    private static final String BASE_DIR = "src/test/resources/oclint/compilation_database";

    private OCLintJSONDatabaseBuilder builder;
    private File baseFolder;

    @Before
    public void prepare() {
        builder = new OCLintJSONDatabaseBuilder();
        baseFolder = new File(BASE_DIR);
    }

    @Test
    public void buildNoFile() {
        assertContainer(new Container(
                "noFile",
                0
        ));
    }

    @Test
    public void buildTwoFiles() {
        assertContainer(new Container(
                "twoFiles",
                2
        ));
    }

    private void assertContainer(Container container) {
        File folder = new File(baseFolder, container.jsonCompilationDatabasePath);

        // Running our code
        String compileCommands = builder.build(folder);

        // Asserting
        JSONArray jsonArray = new JSONArray(compileCommands);
        assertThat(jsonArray).hasSize(container.size);
    }

}
