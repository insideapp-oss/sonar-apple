
![CI](https://github.com/insideapp-oss/sonar-flutter/workflows/CI/badge.svg)

[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=insideapp-oss_sonar-apple&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=insideapp-oss_sonar-apple)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=insideapp-oss_sonar-apple&metric=coverage)](https://sonarcloud.io/summary/new_code?id=insideapp-oss_sonar-apple)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=insideapp-oss_sonar-apple&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=insideapp-oss_sonar-apple)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=insideapp-oss_sonar-apple&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=insideapp-oss_sonar-apple)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=insideapp-oss_sonar-apple&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=insideapp-oss_sonar-apple)


# SonarQube plugin for Swift / Objective-C

A plugin to enable analysis of Swift and Objective-C code quality and security.

Currently, under (heavy) development. Checkout the develop branch.

Let us know if you want to get involved.

## Features

The plugin is designed to support Swift 5 syntax.

| Feature             | Swift                                                        | Objective-C                               |
|---------------------|--------------------------------------------------------------|-------------------------------------------|
| Size                | IN PROGRESS                                                  | IN PROGRESS                               |
| Issues              | [SwiftLint 0.47.0](https://github.com/realm/SwiftLint) rules | [OCLint 22.02](https://oclint.org/) rules |
| Tests               | YES                                                          | IN PROGRESS                               |
| Coverage            | IN PROGRESS                                                  | IN PROGRESS                               |
| Complexity          | IN PROGRESS                                                  | IN PROGRESS                               |
| Syntax highlighting | IN PROGRESS                                                  | IN PROGRESS                               |

## Requirements

### Xcode

Download Xcode from [Apple Developer](https://developer.apple.com/download/).

The plugin was tested with Xcode 13+, but should work with older versions.

### sonar-scanner (requires Java)

Install sonar-scanner as explained in the [official documentation]((https://docs.sonarqube.org/latest/analysis/scan/sonarscanner/)).

### xcpretty and slather

In order to generate reports from ``xcodebuild`` commands, extract command line tools are needed.

- [xcpretty](https://github.com/xcpretty/xcpretty) generates test reports
- [slather](https://github.com/SlatherOrg/slather) generates coverage reports

### SwiftLint

SwiftLint is used to analyse Swift source files.

See install instructions [here](https://github.com/realm/SwiftLint).

### OCLint

OCLint is used to analyse Objective-C source files.

See install instructions [here](https://docs.oclint.org/en/stable/intro/homebrew.html).

Important: after initial installation, macOS will block usage of OCLint libraries. In order to get rid of the manual verification of each of them, use the following commands:

```bash
$ sudo xattr -dr com.apple.quarantine /usr/local/lib/oclint/rules/lib*
$ sudo xattr -dr com.apple.quarantine /usr/local/lib/oclint/reporters/lib*
```

## Installation (on the server)

SonarQube 7.9+ is required.

- Download the plugin binary into the ``$SONARQUBE_HOME/extensions/plugins`` directory.
- Restart the server.

## Project configuration

Create a ``sonar-project.properties`` file at the root with this content:

```properties
# Project identification
sonar.projectKey=ios_app
sonar.projectName=iOS App
sonar.projectVersion=1.0
	
# Source code location.
# Path is relative to the sonar-project.properties file. Defaults to .
# Use commas to specify more than one folder.
sonar.sources=iOSApp
sonar.tests=iOSAppTests

# Path to test report (junit.xml)
# Defaults to build/reports
#sonar.junit.reportsPaths=

# Encoding of the source code. Default is default system encoding.
sonar.sourceEncoding=UTF-8
```

For a complete list of available options, please refer to the [SonarQube documentation](https://docs.sonarqube.org/latest/analysis/analysis-parameters/).

## Run analysis

Use the following commands from the root folder to start an analysis:

```bash

# Run tests with xcpretty to generate test report in build/reports/junit.xml
# Also saves Xcode log to build/xcodebuild.log (this is necessary for Objective-C code analysis)
# Don't forget to add -workspace to the build command if your project is part of a workspace
$ xcodebuild \
  -project MyApp.xcodeproj \
  -scheme MyApp \
  -sdk iphonesimulator \
  -destination 'platform=iOS Simulator,name=iPhone 11 Pro' \
   clean test | tee build/xcodebuild.log | xcpretty --report junit
  
# Run the analysis and publish to the SonarQube server
$ sonar-scanner
```

## Contributing

Any help is welcome, and PRs will be greatly appreciated!

Have a look at the [developer guide](https://github.com/insideapp-oss/sonar-apple/blob/main/DEVELOP.md) to get started.

## License

This plugin is released under the GNU LGPL v3 license. See the [LICENSE](https://github.com/insideapp-oss/sonar-apple/blob/main/LICENSE.md) file for more information.