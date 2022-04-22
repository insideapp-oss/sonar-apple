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
package fr.insideapp.sonarqube.apple.commons.tests;

import fr.insideapp.sonaqube.apple.commons.tests.StaxParser;
import fr.insideapp.sonaqube.apple.commons.tests.UnitTestClassReport;
import fr.insideapp.sonaqube.apple.commons.tests.UnitTestIndex;
import org.junit.Test;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.net.URISyntaxException;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class JUnitStaxHandlerTest {

    @Test
    public void parse() throws XMLStreamException {

        UnitTestIndex index = new UnitTestIndex();

        StaxParser parser = new StaxParser(index);
        File xmlFile;
        try {
            xmlFile = new File(Objects.requireNonNull(getClass().getResource("/tests/junit.xml")).toURI());
        } catch (URISyntaxException e) {
            throw new IllegalStateException(e);
        }
        parser.parse(xmlFile);
        
        assertThat(index.size()).isEqualTo(1);

        UnitTestClassReport report = index.get("SQAppTests.SQAppTests");
        assertThat(report.getTests()).isEqualTo(4);
        assertThat(report.getErrors()).isEqualTo(1);
        assertThat(report.getFailures()).isEqualTo(1);

    }



}
