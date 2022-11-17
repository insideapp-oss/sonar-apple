package fr.insideapp.sonarqube.apple.commons;

public interface CommandLineToolRunnable<T> {
    T run() throws Exception;
}
