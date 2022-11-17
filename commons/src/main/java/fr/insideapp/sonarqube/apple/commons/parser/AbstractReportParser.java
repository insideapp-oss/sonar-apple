package fr.insideapp.sonarqube.apple.commons.parser;

import fr.insideapp.sonarqube.apple.commons.interfaces.ReportParsable;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractReportParser<T> implements ReportParsable<List<T>> {

    private static final Logger LOGGER = Loggers.get(AbstractReportParser.class);

    protected abstract List<T> perform(String input) throws Exception;

    public List<T> parse(String input) {
        List<T> issues = new ArrayList<>();
        try {
            issues.addAll(perform(input));
        } catch (Exception e) {
            LOGGER.error("Parsing failed. Run in verbose to get more information.");
            LOGGER.debug("{}", e);
        }
        LOGGER.info("Parsed {} issue(s)", issues.size());
        return issues;
    }

}
