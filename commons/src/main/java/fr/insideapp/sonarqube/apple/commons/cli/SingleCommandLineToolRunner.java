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
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

public abstract class SingleCommandLineToolRunner extends CommandLineToolRunner implements CommandLineToolRunnable<String> {

    private static final Logger LOGGER = Loggers.get(SingleCommandLineToolRunner.class);

    protected SingleCommandLineToolRunner(String command) {
        super(command);
    }

    protected abstract String[] options();

    @Override
    public String run() {
        try {
            return execute(options());
        } catch (Exception e) {
            LOGGER.error("Running failed. Run in verbose to get more information.");
            LOGGER.debug("{}", e);
            return "";
        }

    }

}
