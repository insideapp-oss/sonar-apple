package fr.insideapp.sonarqube.apple.commons.mapper;

import fr.insideapp.sonarqube.apple.commons.interfaces.ReportIssueMappable;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractReportMapper<T> implements ReportIssueMappable<T> {

    private static final Logger LOGGER = Loggers.get(AbstractReportMapper.class);

    protected abstract Set<ReportIssue> perform(T input) throws Exception;

    public Set<ReportIssue> map(T input) {
        Set<ReportIssue> issues = new HashSet<>();
        try {
            issues.addAll(perform(input));
        } catch (Exception e) {
            LOGGER.error("Mapping failed. Run in verbose to get more information.");
            LOGGER.debug("{}", e);
        }
        LOGGER.info("Mapped to {} issue(s)", issues.size());
        return issues;
    }

}