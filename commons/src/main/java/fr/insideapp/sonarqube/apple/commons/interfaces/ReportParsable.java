package fr.insideapp.sonarqube.apple.commons.interfaces;

public interface ReportParsable<T> {

    T parse(String input);

}
