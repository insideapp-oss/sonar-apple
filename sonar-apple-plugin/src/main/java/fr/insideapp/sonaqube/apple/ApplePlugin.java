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
package fr.insideapp.sonaqube.apple;

import fr.insideapp.sonarqube.swift.lang.Swift;
import org.sonar.api.Plugin;

public class ApplePlugin implements Plugin {

    @Override
    public void define(Context context) {

        // Language support
        context.addExtension(Swift.class);

    }
}
