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

import fr.insideapp.sonarqube.apple.commons.interfaces.CommandLineToolRunnable;
import org.sonar.api.config.Configuration;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.List;

public abstract class SingleCommandLineToolBuilder extends CommandLineToolBuilder implements CommandLineToolRunnable<String> {

    private static final Logger LOGGER = Loggers.get(SingleCommandLineToolBuilder.class);

    protected SingleCommandLineToolBuilder(Configuration configuration, String command) {
        super(configuration, command);
    }

    protected abstract String[] options(List<String> sources);

    @Override
    public String run() {
        try {
            return build(options(sources()))
                    .run()
                    .getOutputString();
        } catch (Exception e) {
            LOGGER.error("Running failed. Run in verbose to get more information.");
            LOGGER.debug("{}", e);
            return "";
        }

    }

}
