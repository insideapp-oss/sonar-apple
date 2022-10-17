
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

| Feature             | Availability                                                                                                      |
|---------------------|-------------------------------------------------------------------------------------------------------------------|
| Tests               | ✅                                                                                                                 |
| Coverage            | ✅                                                                                                                 |
| Complexity          | Swift, Objective-C                                                                                                |
| Dead code           | Swift ([Periphery](https://github.com/peripheryapp/periphery))                                                    |
| Size                | Swift, Objective-C                                                                                                |
| Syntax highlighting | Swift, Objective-C                                                                                                |
| Issues              | Swift ([SwiftLint 0.48.0](https://github.com/realm/SwiftLint)), Objective-C ([OCLint 22.02](https://oclint.org/)) |
| Security            | Swift, Objective-C ([mobsfscan 0.11.0](https://github.com/MobSF/mobsfscan))                                       |

## Requirements

### Xcode

Download Xcode from [Apple Developer](https://developer.apple.com/download/).

The plugin was tested with Xcode 13+, but should work with older versions.

### sonar-scanner (requires Java)

Install sonar-scanner as explained in the [official documentation]((https://docs.sonarqube.org/latest/analysis/scan/sonarscanner/)).

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

### mobsfscan

mobsfscan is used to analyse Swift & Objective-C source files to find insecure code patterns.

See install instructions [here](https://github.com/MobSF/mobsfscan).

### Periphery

Periphery is used to analyse Swift source files to find unused code.

See install instructions [here](https://github.com/peripheryapp/periphery).

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
# Tests source code location.
# Path is relative to the sonar-project.properties file. Defaults to empty.
# Use commas to specify more than one folder.
sonar.tests=iOSAppTests

# Path to the Xcode result bundle file. 
# The path is relative to the project base directory.
# Defaults to build/result.xcresult
# sonar.apple.resultBundlePath=custom/path/to/file.xcresult

# Path to xcodebuild.log file
# Defaults to build
# sonar.apple.xcodebuild.logPath=custom/path/to/file.log

# Path to periphery.log file
# Defaults to build
# sonar.apple.periphery.logPath=custom/path/to/file.log

# Encoding of the source code. Default is default system encoding.
sonar.sourceEncoding=UTF-8
```

For a complete list of available options, please refer to the [SonarQube documentation](https://docs.sonarqube.org/latest/analysis/analysis-parameters/).

## Run analysis

Use the following commands from the root folder to start an analysis:

```bash

# Run tests 
# Don't forget to add -workspace to the build command if your project is part of a workspace
# Don't forget to activate 'Gather coverage' option in the app scheme or add '-enableCodeCoverage YES' to the following command
$ xcodebuild \
  -project MyApp.xcodeproj \
  -scheme MyApp \
  -sdk iphonesimulator \
  -destination 'platform=iOS Simulator,name=iPhone 11 Pro' \
  -derivedDataPath ./derivedData \
  -resultBundlePath build/result.xcresult \
   clean test

# Saves Periphery log to build/periphery.log (this is necessary for Swift dead code analysis)
# Don't forget to add --workspace to the build command if your project is part of a workspace
$ periphery scan \
  --project "MyApp.xcodeproj" \
  --schemes "MyApp" \
  --targets "MyApp" \
  --skip-build \
  --index-store-path ./derivedData/Index/DataStore \
  --format xcode \
  --quiet | tee build/periphery.log

# This rebuild is required to perform Objective-C issue analysis
# Skip it if your project doe not use Objective-C, or if you do want to report Objective-C issues
$ xcodebuild \
  -project MyApp.xcodeproj \
  -scheme MyApp \
  -sdk iphonesimulator \
  -destination 'platform=iOS Simulator,name=iPhone 11 Pro' \
   COMPILER_INDEX_STORE_ENABLE=NO clean test | tee build/xcodebuild.log
  
# Run the analysis and publish to the SonarQube server
# Don't forget to specify `sonar.host.url` and `sonar.login` in `sonar-project.properties` or supply it to the following command.
$ sonar-scanner
```

## Contributing

Any help is welcome, and PRs will be greatly appreciated!

Have a look at the [developer guide](https://github.com/insideapp-oss/sonar-apple/blob/main/DEVELOP.md) to get started.

## License

This plugin is released under the GNU LGPL v3 license. See the [LICENSE](https://github.com/insideapp-oss/sonar-apple/blob/main/LICENSE.md) file for more information.
