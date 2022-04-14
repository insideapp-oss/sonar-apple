package fr.insideapp.sonaqube.swift.lang.antlr;

import fr.insideapp.sonarqube.swift.lang.antlr.AntlrContext;
import fr.insideapp.sonarqube.swift.lang.antlr.AntlrUtils;
import fr.insideapp.sonarqube.swift.lang.antlr.CustomTreeVisitor;
import fr.insideapp.sonarqube.swift.lang.antlr.ParseTreeItemVisitor;
import fr.insideapp.sonarqube.swift.lang.antlr.generated.Swift5Lexer;
import fr.insideapp.sonarqube.swift.lang.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.mockito.Mock;
import org.sonar.api.batch.sensor.SensorContext;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomTreeVisitorTest {

    private static final String MAIN_SRC = "/swift/main.swift";

    @Mock
    private SensorContext sensorContext;

    @Test
    public void visit() throws IOException {

        final CharStream charStream = CharStreams.fromStream(Objects.requireNonNull(this.getClass().getResourceAsStream(MAIN_SRC)));
        final Swift5Lexer lexer = new Swift5Lexer(charStream);
        lexer.removeErrorListeners();
        final CommonTokenStream stream = new CommonTokenStream(lexer);
        stream.fill();
        final Swift5Parser parser = new Swift5Parser(stream);
        parser.removeErrorListeners();
        final ParseTree root = parser.top_level();

        CustomTreeVisitor customTreeVisitor = new CustomTreeVisitor(new ParseTreeItemVisitor() {
            @Override
            public void apply(ParseTree tree) {

            }

            @Override
            public void fillContext(SensorContext context, AntlrContext antlrContext) {
                assertThat(antlrContext.getTokens().length).isEqualTo(30);
            }
        });
        AntlrContext antlrContext = AntlrUtils.getRequest(IOUtils.toString(Objects.requireNonNull(this.getClass().getResourceAsStream(MAIN_SRC)), StandardCharsets.UTF_8));
        customTreeVisitor.visit(root);
        customTreeVisitor.fillContext(sensorContext, antlrContext);
    }

}