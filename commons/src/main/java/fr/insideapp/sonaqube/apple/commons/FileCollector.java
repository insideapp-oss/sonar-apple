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
package fr.insideapp.sonaqube.apple.commons;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileCollector {

    private FileCollector() {
        throw new UnsupportedOperationException();
    };

    public static List<File> collect(File reportsDir, String glob) throws IOException {
        List<File> files = new ArrayList<>();
        DirectoryStream<Path> stream = null;
        try {
            stream = Files.newDirectoryStream(reportsDir.toPath(), glob);
            for (Path p : stream) {
                files.add(p.toFile());
            }
        } finally {
            if (stream != null) {
                stream.close();
            }
        }

       return  files;
    }
}
