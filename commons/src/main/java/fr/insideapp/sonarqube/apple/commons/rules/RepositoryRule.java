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
package fr.insideapp.sonarqube.apple.commons.rules;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class RepositoryRule {

    public enum Severity {
        BLOCKER,
        CRITICAL,
        MAJOR,
        MINOR,
        INFO
    }

    public enum Type {
        CODE_SMELL,
        BUG,
        VULNERABILITY,
        SECURITY_HOTSPOT
    }

    public final String key;

    public final String name;

    public final Severity severity;

    public final String description;

    public final Type type;

    public final String debt;

    @JsonCreator
    public RepositoryRule(
            @JsonProperty("key") String key,
            @JsonProperty("name") String name,
            @JsonProperty("severity") Severity severity,
            @JsonProperty("description") String description,
            @JsonProperty("type") Type type,
            @JsonProperty("debt") String debt
    ) {
        this.key = key;
        this.name = name;
        this.severity = severity;
        this.description = description;
        this.type = type;
        this.debt = debt;
    }

}
