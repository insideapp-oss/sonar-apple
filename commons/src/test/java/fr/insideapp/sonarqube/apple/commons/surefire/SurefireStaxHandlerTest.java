package fr.insideapp.sonarqube.apple.commons.surefire;

import fr.insideapp.sonaqube.apple.commons.surefire.StaxParser;
import fr.insideapp.sonaqube.apple.commons.surefire.UnitTestClassReport;
import fr.insideapp.sonaqube.apple.commons.surefire.UnitTestIndex;
import org.junit.Test;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.net.URISyntaxException;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class SurefireStaxHandlerTest {

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
