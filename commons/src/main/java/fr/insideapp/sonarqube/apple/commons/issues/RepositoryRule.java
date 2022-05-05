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
package fr.insideapp.sonarqube.apple.commons.issues;

public final class RepositoryRule {

    private final String key;
    private final String name;
    private final String severity;
    private final String description;
    private final String type;
    private final RepositoryRuleDebt debt;

    public RepositoryRule(final String key, final String name, final String severity, final String description, final String type, final RepositoryRuleDebt debt) {
        this.key = key;
        this.name = name;
        this.severity = severity;
        this.description = description;
        this.type = type;
        this.debt = debt;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getSeverity() {
        return severity;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public RepositoryRuleDebt getDebt() {
        return debt;
    }
}
