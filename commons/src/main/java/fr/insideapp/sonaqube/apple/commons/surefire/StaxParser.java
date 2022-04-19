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
package fr.insideapp.sonaqube.apple.commons.surefire;

import com.ctc.wstx.api.WstxInputProperties;
import com.ctc.wstx.stax.WstxInputFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import org.codehaus.staxmate.SMInputFactory;
import org.codehaus.staxmate.in.SMHierarchicCursor;
import org.sonarsource.analyzer.commons.xml.SafeStaxParserFactory;

public class StaxParser {

    private final SMInputFactory inf;
    private final SurefireStaxHandler streamHandler;

    public StaxParser(UnitTestIndex index) {
        this.streamHandler = new SurefireStaxHandler(index);
        XMLInputFactory xmlInputFactory = SafeStaxParserFactory.createXMLInputFactory();
        if (xmlInputFactory instanceof WstxInputFactory) {
            WstxInputFactory wstxInputfactory = (WstxInputFactory) xmlInputFactory;
            wstxInputfactory.configureForLowMemUsage();
            wstxInputfactory.getConfig().setUndeclaredEntityResolver((String publicID, String systemID, String baseURI, String namespace) -> namespace);
            wstxInputfactory.setProperty(WstxInputProperties.P_MAX_ATTRIBUTE_SIZE, Integer.MAX_VALUE);
        }
        this.inf = new SMInputFactory(xmlInputFactory);
    }

    public void parse(File xmlFile) throws XMLStreamException {
        try (FileInputStream input = new FileInputStream(xmlFile)) {
            parse(inf.rootElementCursor(input));
        } catch (IOException e) {
            throw new XMLStreamException(e);
        }
    }

    private void parse(SMHierarchicCursor rootCursor) throws XMLStreamException {
        try {
            streamHandler.stream(rootCursor);
        } finally {
            rootCursor.getStreamReader().closeCompletely();
        }
    }
}
