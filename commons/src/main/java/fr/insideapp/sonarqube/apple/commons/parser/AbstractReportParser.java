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
package fr.insideapp.sonarqube.apple.commons.parser;

import fr.insideapp.sonarqube.apple.commons.interfaces.ReportParsable;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractReportParser<T> implements ReportParsable<List<T>> {

    private static final Logger LOGGER = Loggers.get(AbstractReportParser.class);

    protected abstract List<T> perform(String input) throws Exception;

    public List<T> parse(String input) {
        List<T> issues = new ArrayList<>();
        try {
            issues.addAll(perform(input));
        } catch (Exception e) {
            LOGGER.error("Parsing failed. Run in verbose to get more information.");
            LOGGER.debug("{}", e);
        }
        LOGGER.info("Parsed {} issue(s)", issues.size());
        return issues;
    }

}
