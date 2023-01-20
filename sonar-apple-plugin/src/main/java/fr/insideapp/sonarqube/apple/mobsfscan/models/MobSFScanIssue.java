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
package fr.insideapp.sonarqube.apple.mobsfscan.models;

import java.util.List;
import java.util.Map;

public final class MobSFScanIssue {

    public final String rule;

    public final String description;

    public final List<MobSFScanReportResultLocation> locations;

    public MobSFScanIssue(Map.Entry<String, MobSFScanReportResult> entry) {
        this.rule = entry.getKey();
        this.description = entry.getValue().description;
        this.locations = entry.getValue().locations;
    }

    public MobSFScanIssue(
            final String rule,
            final String description,
            final List<MobSFScanReportResultLocation> locations
    ) {
        this.rule = rule;
        this.description = description;
        this.locations = locations;
    }

}