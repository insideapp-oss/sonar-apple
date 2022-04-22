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

### SwitLint update

Use the following command to update the SwiftLint rules file:

```bash
$ mvn groovy:execute -Dsource=scripts/updateSwiftLintRules.groovy
```

### Filling rules information

Eventhough updating rule repository file is mostly automatic, some data related to rules cannot be automatically computed.

This is the case for :
- severity (blocker, critical, major, minor, info)
- type (code smell, bug, vulnerability)
- debt (remediation effort estimate)

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
- The RulesDefinition is ``swift-lang/src/main/java/fr/insideapp/sonarqube/swift/lang/issues/swiftlint/SwiftLintRulesDefinition.java``
- The ReportParser is ``swift-lang/src/main/java/fr/insideapp/sonarqube/swift/lang/issues/swiftlint/SwiftLintReportParser.java``
- The Sensor is ``swift-lang/src/main/java/fr/insideapp/sonarqube/swift/lang/issues/swiftlint/SwiftLintSensor.java``

Also, when adding a new sensor for a language, don't forget to declare its rules into a profile. See ``swift-lang/src/main/java/fr/insideapp/sonarqube/swift/lang/issues/SwiftProfile.java`` as an example.