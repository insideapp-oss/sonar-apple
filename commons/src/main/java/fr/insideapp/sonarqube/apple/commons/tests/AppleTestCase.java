package fr.insideapp.sonarqube.apple.commons.tests;

import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestMetadata;

public class AppleTestCase {

    public enum Status {
        SUCCESS,
        FAILURE,
        SKIPPED,
        MIXED,
        UNKNOWN;

        public static Status builder(String status) {
            switch (status) {
                case "Success":
                    return Status.SUCCESS;
                case "Failure":
                    return Status.FAILURE;
                case "Skipped":
                    return Status.SKIPPED;
                case "Mixed":
                    return Status.MIXED;
                default:
                    return Status.UNKNOWN;
            }
        }
    }

    public String name;
    public Double duration;
    public Status status;

    public AppleTestCase(ActionTestMetadata metadata) {
        this.name = metadata.name;
        this.duration = metadata.duration;
        this.status = Status.builder(metadata.status);
    }

}
