package fr.insideapp.sonarqube.swift.lang.antlr;

import org.sonar.api.internal.apachecommons.io.IOUtils;

import java.io.IOException;
import java.nio.charset.Charset;

public class AntlrUtils {

    public static AntlrContext getRequest(String text) throws IOException {
        return AntlrContext.fromStreams(null, IOUtils.toInputStream(text, Charset.defaultCharset()),
                IOUtils.toInputStream(text, Charset.defaultCharset()), Charset.defaultCharset());

    }

}
