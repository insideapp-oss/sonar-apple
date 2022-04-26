package fr.insideapp.sonarqube.apple.commons;

public class SensorRuntimeException extends RuntimeException {
    public SensorRuntimeException(InterruptedException e) {
        super(e);
    }
}