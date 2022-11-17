package fr.insideapp.sonarqube.apple.commons.interfaces;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;

import java.util.Set;

public interface ReportIssueMappable<T> {

    Set<ReportIssue> map(T input);

}
