
![CI](https://github.com/insideapp-oss/sonar-flutter/workflows/CI/badge.svg)

[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=insideapp-oss_sonar-apple&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=insideapp-oss_sonar-apple)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=insideapp-oss_sonar-apple&metric=coverage)](https://sonarcloud.io/summary/new_code?id=insideapp-oss_sonar-apple)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=insideapp-oss_sonar-apple&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=insideapp-oss_sonar-apple)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=insideapp-oss_sonar-apple&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=insideapp-oss_sonar-apple)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=insideapp-oss_sonar-apple&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=insideapp-oss_sonar-apple)


# SonarQube plugin for Swift / Objective-C

A plugin to enable analysis of Swift and Objective-C code quality and security.

Let us know if you want to get involved.

## Features

The plugin is designed to support Swift 5 syntax.

| Feature             | Tool(s)           | Availability       |
|---------------------|-------------------|--------------------|
| Tests               | Xcode             | Swift, Objective-C |
| Coverage            | Xcode             | Swift, Objective-C |
| Complexity          | SonarQube         | Swift, Objective-C |
| Dead code           | Periphery         | Swift              |
| Size                | SonarQube         | Swift, Objective-C |
| Syntax highlighting | SonarQube         | Swift, Objective-C |
| Issues              | SwiftLint, OCLint | Swift, Objective-C |
| Security            | mobsfscan         | Swift, Objective-C |

## Installation

### Server-side

SonarQube 7.9+ is required.

- Download the plugin binary into the ``$SONARQUBE_HOME/extensions/plugins`` directory.
- Restart the server.
- Activate the rules in your Quality Profiles.

### Client-side

Xcode 13+ and SonarScanner are required.
The following tools are optional:

- [SwiftLint](https://github.com/realm/SwiftLint)
- [OCLint](https://oclint.org/)
- [mobsfscan](https://github.com/MobSF/mobsfscan)
- [Periphery](https://github.com/peripheryapp/periphery)

#### Sonar configuration

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

## Coverage & Tests ##

# Path to the Xcode result bundle file. 
# The path is relative to the project base directory.
# Defaults to build/result.xcresult
#sonar.apple.resultBundlePath=custom/path/to/file.xcresult

## Periphery ##

# Index Store folder path.
# This matches the parameter "-derivedDataPath" in xcodebuild (see below).
# Warning: starting Xcode 14 the folder "Index" is renamed "Index.noindex".
sonar.apple.periphery.indexStorePath=derivedData/Index/DataStore

## OCLint ##

# Path to the JSON Compilation Database folder
# The path is relative to the project base directory.
# Defaults to build/json_compilation_database
# sonar.apple.jsonCompilationDatabasePath=custom/path/to/folder

## Misc ##

# Encoding of the source code. Default is default system encoding.
sonar.sourceEncoding=UTF-8
```

For a complete list of available options, please refer to the [SonarQube documentation](https://docs.sonarqube.org/latest/analysis/analysis-parameters/).

#### Run analysis

Use the following commands from the root folder to start an analysis:

```bash
# Don't forget to add -workspace to the build command if your project is part of a workspace
# Don't forget to activate 'Gather coverage' option in the app scheme or add '-enableCodeCoverage YES' to the following command

# Run tests 
xcrun xcodebuild \
  -project MyApp.xcodeproj \
  -scheme MyApp \
  -sdk iphonesimulator \
  -destination 'platform=iOS Simulator,name=iPhone 11 Pro' \
  -derivedDataPath ./derivedData \
  -resultBundlePath build/result.xcresult \
  OTHER_CFLAGS="\$(inherited) -gen-cdb-fragment-path build/compilation_database" \
  -quiet \
  clean test

# Run the analysis and publish to the SonarQube server
# Don't forget to specify `sonar.host.url` and `sonar.login` in `sonar-project.properties` or supply it to the following command.
sonar-scanner
```

### Advanced configuration

#### Periphery

The plugin assumes the Periphery configuration is properly settled for your project, in the [Periphery configuration file](https://github.com/peripheryapp/periphery#configuration).
The required information are the project, the schemes and the targets. You also need to provide the workspace, if you have one.
```yaml
workspace: path/to/workspace.xcworkspace # optional
project: path/to/project.xcodeproj
schemes:
  - MyScheme
targets:
  - MyTarget
```

#### OCLint

On macOS, the system will block usage of OCLint. In order to get rid of the manual verification of each of them, use the following commands:

```bash
sudo xattr -dr com.apple.quarantine /usr/local/lib/oclint/rules/lib*
sudo xattr -dr com.apple.quarantine /usr/local/lib/oclint/reporters/lib*
```

#### Sonar Scanner

If you have trouble running the Sonar Scanner, you can run it in verbose mode, to get more logs and information.
You can either:
- add `sonar.verbose=true` to your `sonar-project.properties`
- add the option `X` to the command, like so: `sonar-scanner -X ...`

## Contributing

Any help is welcome, and PRs will be greatly appreciated!

Have a look at the [developer guide](https://github.com/insideapp-oss/sonar-apple/blob/main/DEVELOP.md) to get started.

## License

This plugin is released under the GNU LGPL v3 license. See the [LICENSE](https://github.com/insideapp-oss/sonar-apple/blob/main/LICENSE.md) file for more information.
