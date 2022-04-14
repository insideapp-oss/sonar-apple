package fr.insideapp.sonarqube.swift.lang;

import org.sonar.api.internal.apachecommons.io.input.BOMInputStream;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class SourceLinesProvider {

    private static final Logger LOGGER = Loggers.get(SourceLinesProvider.class);

    public SourceLine[] getLines(final InputStream inputStream, final Charset charset) {
        if (inputStream == null) {
            return new SourceLine[0];
        }
        final List<SourceLine> sourceLines = new ArrayList<>();

        try (final BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new BOMInputStream(inputStream, false), charset))) {
            int totalLines = 1;
            int global = 0;
            int count = 0;

            int currentChar;
            while ((currentChar = bufferedReader.read()) != -1) {

                global++;
                count++;
                if (currentChar == 10) {
                    sourceLines.add(new SourceLine(totalLines, count, global - count, global));
                    totalLines++;
                    count = 0;
                }

            }
            sourceLines.add(new SourceLine(totalLines, count, global - count, global));
        } catch (final Throwable e) {
            LOGGER.warn("Error occurred reading file", e);
        }

        return sourceLines.toArray(new SourceLine[0]);
    }

}
