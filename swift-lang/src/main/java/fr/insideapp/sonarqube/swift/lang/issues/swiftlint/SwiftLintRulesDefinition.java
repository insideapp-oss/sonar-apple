package fr.insideapp.sonarqube.swift.lang.issues.swiftlint;

import fr.insideapp.sonarqube.swift.lang.Swift;

import org.sonar.api.rules.RuleType;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.squidbridge.rules.SqaleXmlLoader;
import org.sonarsource.analyzer.commons.internal.json.simple.JSONArray;
import org.sonarsource.analyzer.commons.internal.json.simple.JSONObject;
import org.sonarsource.analyzer.commons.internal.json.simple.JSONValue;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class SwiftLintRulesDefinition implements RulesDefinition {

    private static final Logger LOGGER = Loggers.get(SwiftLintRulesDefinition.class);
    public static final String REPOSITORY_KEY = "SwiftLint";
    private static final String RULES_FILE = "/fr/insideapp/sonarqube/swift/swiftlint/rules.json";
    public static final String REPOSITORY_NAME = REPOSITORY_KEY;

    @Override
    public void define(Context context) {
        NewRepository repository = context.createRepository(REPOSITORY_KEY, Swift.KEY).setName(REPOSITORY_NAME);

        try(Reader reader = new InputStreamReader(getClass().getResourceAsStream(RULES_FILE), Charset.forName("UTF-8"))){
            JSONArray slRules = (JSONArray) JSONValue.parse(reader);
            if(slRules != null){
                for (Object obj : slRules) {
                    JSONObject slRule = (JSONObject) obj;
                    repository.createRule((String) slRule.get("key"))
                        .setName((String) slRule.get("name"))
                        .setSeverity((String) slRule.get("severity"))
                        // FIXME : add type from file when available !
                        .setType(RuleType.valueOf("CODE_SMELL"))
                        .setHtmlDescription((String) slRule.get("description"));
                }
            }
        } catch (IOException e) {
            LOGGER.error("Failed to load SwiftLint rules", e);
        }
        SqaleXmlLoader.load(repository, "/fr/insideapp/sonarqube/swift/swiftlint/model.xml");
        repository.done();
    }
}
