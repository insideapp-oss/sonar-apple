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

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.insideapp.sonarqube.apple.commons.result.models.Reference;
import fr.insideapp.sonarqube.apple.commons.result.models.coverage.ActionCodeCoverage;
import fr.insideapp.sonarqube.apple.commons.result.models.Record;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AppleResultExtractorTest {

    private static final String BASE_DIR = "src/test/resources/result";
    private static final String XCRESULT = "build_result.xcresult";

    private static final String RECORD = "record.json";
    private AppleResultExtractor extractor;
    private File xcResultFile;
    private File recordFile;
    private ObjectMapper objectMapper;

    @Before
    public void prepare() {
        extractor = new AppleResultExtractor();
        xcResultFile = new File(BASE_DIR, XCRESULT);
        recordFile = new File(BASE_DIR, RECORD);
        objectMapper = new ObjectMapper();
    }

    @Test
    public void getInvocationRecord() throws Exception {
        // testing
        Record record = extractor.getInvocationRecord(xcResultFile);
        // asserting
        assertThat(record.actions).hasSize(1);
        String recordJSON = objectMapper.writeValueAsString(record);
        String expectedRecordJSON = FileUtils.readFileToString(recordFile, Charset.defaultCharset());
        assertThat(recordJSON).isEqualTo(expectedRecordJSON);
    }

    @Test
    public void getCoverage() throws Exception {
        // testing
        Reference archiveReference = new Reference("0~eODXsnL5oX2uqzogYveVF3xvXpqGwIceDeJ4HxY5JiiGoazGNUaYrN0kFb8dHRh6UBX8XzfhgwoyKnEXE785tA==");
        List<ActionCodeCoverage> codeCoverage = extractor.getCoverage(xcResultFile, List.of(archiveReference));
        // asserting
        assertThat(codeCoverage).hasSize(7);
    }

}
