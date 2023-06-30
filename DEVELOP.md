# Developer guide

This documentation is a guide for plugin developers / contributors.

## Requirements

 - A recent Java JDK version
 - Maven 3.8 or later
 - A local SonarQube instance for local testing

## Main commands

#### Add missing license headers on source files

```bash
$ mvn license:format
```

#### Local plugin deployment

In order to start the plugin, SONARQUBE_HOME environment variable must be set

If variable is already set, use:
```bash
$ mvn install
```

If variable is not set, it can be set inline:
```bash
$ SONARQUBE_HOME=~/path/to/sonarqube mvn install
```

When started locally SonarQube UI is available at http://localhost:9000

#### Packaging

```bash
$ mvn package
```

## Updating rules

The plugin rules are based on external linters such as SwiftLint.

When a new version of the linter (with new rules) is released, the matching repositoryRule repository must be updated as well in order to include the new rules.

This update is mostly automatic with the execution of a Groovy script.

### SwiftLint update

Use the following command to update the SwiftLint rules file:

```bash
$ mvn groovy:execute -Dsource=scripts/updateSwiftLintRules.groovy
```

### OCLint update

Use the following command to update the OCLint rules file:

```bash
$ mvn groovy:execute -Dsource=scripts/updateOCLintRules.groovy
```

### mobsfscan update

Use the following command to update the mobsfscan rules file:

```bash
$ mvn groovy:execute -Dsource=scripts/updateMobSFScanRules.groovy
```

### Filling rules information

Even though updating rule repository file is mostly automatic, some data related to rules cannot be automatically computed.

This is the case for :
- severity (blocker, critical, major, minor, info)
- type (code smell, bug, vulnerability)
- debt (remediation effort estimate, optional)

At the end of a rule update script, rules are scanned, and you are asked to fill missing information:

```console
Missing information on rule closure_parameter_position
Closure Parameter Position
Closure parameters should be on the same line as opening brace.

Severity ? (1 = BLOCKER, 2 = CRITICAL, 3 = MAJOR, 4 = MINOR, 5 = INFO)
4
MINOR
Type ? (1 = CODE_SMELL, 2 = BUG, 3 = VULNERABILITY, 4 = SECURITY_HOTSPOT)
1
CODE_SMELL
Remediation time ? (in minutes)
1
1min

Missing information on rule closure_spacing
Closure Spacing
Closure expressions should have a single space inside each brace.

Severity ? (1 = BLOCKER, 2 = CRITICAL, 3 = MAJOR, 4 = MINOR, 5 = INFO)
```

## Adding an issue sensor

The plugin comes with several issue sensor, that is a piece of code running on source files and reporting issues.

For example, ``SwiftLintSensor`` is a sensor using SwiftLint tool to run.

A sensor requires different pieces in order to work
- A script, to generate and update the rule repository file.
- A RulesDefinition, to declare rules (loaded from the rule repository file)
- A ReportParser, to parse analysis result (if an external tool is used)
- The Sensor itself, to run the analysis

Have a look at the ``SwiftLintSensor`` implementation:
- The rule update script is ``scripts/updateSwiftLintRules.groovy``
- The RulesDefinition is ``swift-lang/src/main/java/fr/insideapp/sonarqube/swift/issues/swiftlint/SwiftLintRulesDefinition.java``
- The ReportParser is ``swift-lang/src/main/java/fr/insideapp/sonarqube/swift/issues/swiftlint/parser/SwiftLintReportParser.java``
- The Sensor is ``swift-lang/src/main/java/fr/insideapp/sonarqube/swift/issues/swiftlint/SwiftLintSensor.java``

Also, when adding a new sensor for a language, don't forget to declare its rules into a profile. See ``swift-lang/src/main/java/fr/insideapp/sonarqube/swift/issues/SwiftProfile.java`` as an example.

## Releasing

### Snapshots

Every push to `develop` branch updates the matching snapshot release. 

For example: if project version is set to `0.1-SNAPSHOT` on`develop`. A `0.1-SNAPSHOT` will be released (or release will be updated if it already exists) as soon as the `ci.yml` GitHub actions workflow finishes.

### Stable

A new stable release is pushed on GitHub, on every new tag creation (performed by the `release.yml` GitHub Actions workflow).

The steps to issue a new stable release are:
1. Merge `develop` branch to `main`branch (do not squash in order to keep commit history).
2. Create a new tag from `main` branch with a naming matching the release number. Example:
```bash
$ git tag -a 0.1.0
```
3. Push the new tag with:
```bash
$ git push --tags
```

Once released, remember to update the project version on the `develop`branch to a new snapshot number:
```bash
$ mvn versions:set -DnewVersion=0.2-SNAPSHOT
``` 

