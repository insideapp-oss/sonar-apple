package fr.insideapp.sonarqube.apple.commons.result;

import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;

import java.io.File;

public abstract class AppleResultSensor implements Sensor {

    public static final String RESULT_BUNDLE_PATH_KEY = "sonar.apple.resultBundlePath";
    private static final String DEFAULT_RESULT_BUNDLE_PATH = "build/result.xcresult";

    protected final SensorContext context;

    public AppleResultSensor(final SensorContext context) {
        this.context = context;
    }

    private String resultBundlePath() {
        return context.config()
                .get(RESULT_BUNDLE_PATH_KEY)
                .orElse(DEFAULT_RESULT_BUNDLE_PATH);
    }

    public File resultBundle() {
        String resultBundleAbsolutePath = context
                .fileSystem()
                .baseDir()
                .getAbsolutePath()
                .concat(File.separator)
                .concat(resultBundlePath());
        return new File(resultBundleAbsolutePath);
    }

}
