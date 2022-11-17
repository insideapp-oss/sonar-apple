package fr.insideapp.sonarqube.apple.commons;

public final class ExceptionHelper {

    private ExceptionHelper() {}

    public static Exception build() {
        return  new DummyException("My message");
    }


}

class DummyException extends Exception {
    DummyException(String errorMessage) {
        super(errorMessage);
    }
}