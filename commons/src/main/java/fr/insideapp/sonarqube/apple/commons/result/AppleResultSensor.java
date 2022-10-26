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
package fr.insideapp.sonarqube.apple.commons.result;

import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;

import java.io.File;

public abstract class AppleResultSensor implements Sensor {

    public static final String RESULT_BUNDLE_PATH_KEY = "sonar.apple.resultBundlePath";
    private static final String DEFAULT_RESULT_BUNDLE_PATH = "build/result.xcresult";

    protected final SensorContext context;

    protected AppleResultSensor(final SensorContext context) {
        this.context = context;
    }

    private String resultBundlePath() {
        return context.config()
                .get(RESULT_BUNDLE_PATH_KEY)
                .orElse(DEFAULT_RESULT_BUNDLE_PATH);
    }

    public File resultBundle() {
        String resultBundleAbsolutePath = context
                .fileSystem()
                .baseDir()
                .getAbsolutePath()
                .concat(File.separator)
                .concat(resultBundlePath());
        return new File(resultBundleAbsolutePath);
    }

}
