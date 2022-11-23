package fr.insideapp.sonarqube.swift.issues.periphery;

import fr.insideapp.sonarqube.swift.issues.periphery.models.PeripheryIssueLocation;
import fr.insideapp.sonarqube.swift.issues.periphery.models.PeripheryIssueLocationConverter;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class PeripheryIssueLocationConverterTest {

    private PeripheryIssueLocationConverter converter;

    @Before
    public void prepare() {
        converter = new PeripheryIssueLocationConverter();
    }

    @Test
    public void convert_success() {
        // test
        PeripheryIssueLocation location = converter.convert("/path/to/file.swift:13:5");
        // assert
        assertThat(location).isNotNull();
        assertThat(location.path).isEqualTo("/path/to/file.swift");
        assertThat(location.line).isEqualTo(13);
    }

    @Test
    public void convert_failed_no_path() {
        // test
        PeripheryIssueLocation location = converter.convert("");
        // assert
        assertThat(location).isNull();
    }

    @Test
    public void convert_failed_no_line() {
        // test
        PeripheryIssueLocation location = converter.convert("/path/to/file.swift");
        // assert
        assertThat(location).isNull();
    }

}
