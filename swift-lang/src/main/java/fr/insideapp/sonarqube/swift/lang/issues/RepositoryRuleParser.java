package fr.insideapp.sonarqube.swift.lang.issues;

import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonarsource.analyzer.commons.internal.json.simple.JSONArray;
import org.sonarsource.analyzer.commons.internal.json.simple.JSONObject;
import org.sonarsource.analyzer.commons.internal.json.simple.JSONValue;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class RepositoryRuleParser {

    private static final Logger LOGGER = Loggers.get(RepositoryRuleParser.class);

    public ArrayList<RepositoryRule> parse(String resourceName) throws IOException {
        InputStream is =  getClass().getResourceAsStream(resourceName);
        if (is == null) {
            throw new IOException(String.format("JSON rule file not found in resources at %s", resourceName));
        }
        Reader reader = new InputStreamReader(is, Charset.forName("UTF-8"));
        ArrayList<RepositoryRule> repositoryRules = new ArrayList<>();
        JSONArray jsonRules = (JSONArray) JSONValue.parse(reader);
        if (jsonRules != null) {
            for (Object obj : jsonRules) {
                JSONObject jsonRule = (JSONObject) obj;
                JSONObject jsonDebt = (JSONObject) jsonRule.get("debt");
                RepositoryRuleDebt debt = null;
                if (jsonDebt != null) {
                    debt = new RepositoryRuleDebt((String) jsonDebt.get("function"), (String) jsonDebt.get("offset"));
                }
                RepositoryRule repositoryRule = new RepositoryRule(
                        (String) jsonRule.get("key"),
                        (String) jsonRule.get("name"),
                        (String) jsonRule.get("severity"),
                        (String) jsonRule.get("description"),
                        (String) jsonRule.get("type"),
                        debt);
                repositoryRules.add(repositoryRule);
            }
        }
        return repositoryRules;
    }
}
