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
package fr.insideapp.sonaqube.apple.commons.issues;

import org.sonarsource.analyzer.commons.internal.json.simple.JSONArray;
import org.sonarsource.analyzer.commons.internal.json.simple.JSONObject;
import org.sonarsource.analyzer.commons.internal.json.simple.JSONValue;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class RepositoryRuleParser {

    public List<RepositoryRule> parse(String resourceName) throws IOException {
        InputStream is =  getClass().getResourceAsStream(resourceName);
        if (is == null) {
            throw new IOException(String.format("JSON rule file not found in resources at %s", resourceName));
        }
        Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);
        List<RepositoryRule> repositoryRules = new ArrayList<>();
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
