/*
 * SonarQube Apple Plugin
 * Copyright (C) 2022 inside|app
 * contact@insideapp.fr
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package fr.insideapp.sonarqube.swift.lang;

import org.sonar.api.config.Configuration;
import org.sonar.api.resources.AbstractLanguage;

public class Swift extends AbstractLanguage {

    public static final String KEY = "swift";
    private final Configuration config;

    public Swift(Configuration config) {
        super(KEY, "Swift");
        this.config = config;
    }

    @Override
    public String[] getFileSuffixes() {
        return new String[]{"swift"};
    }
}
