
![CI](https://github.com/insideapp-oss/sonar-flutter/workflows/CI/badge.svg)
![Coverage](https://codecov.io/gh/insideapp-oss/sonar-apple/branch/main/graph/badge.svg)


# SonarQube plugin for Swift / Objective-C

A plugin to enable analysis of Swift and Objective-C code quality and security.

Currently, under (heavy) development. Checkout the develop branch.

Let us know if you want to get involved.

## Features

The plugin is designed to support Swift 5 syntax.

| Feature             | Swift       | Objective-C |
|---------------------|-------------|-------------|
| Size                | IN PROGRESS | IN PROGRESS |
| Issues              | IN PROGRESS | IN PROGRESS |
| Tests               | IN PROGRESS | IN PROGRESS |
| Coverage            | IN PROGRESS | IN PROGRESS |
| Complexity          | IN PROGRESS | IN PROGRESS |
| Syntax highlighting | IN PROGRESS | IN PROGRESS |

## Requirements

### Xcode

Download Xcode from [Apple Developer](https://developer.apple.com/download/).

The plugin was tested with Xcode 13+, but should work with older versions.

### sonar-scanner (requires Java)

Install sonar-scanner as explained in the [official documentation]((https://docs.sonarqube.org/latest/analysis/scan/sonarscanner/)).

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

# Encoding of the source code. Default is default system encoding.
sonar.sourceEncoding=UTF-8
```

For a complete list of available options, please refer to the [SonarQube documentation](https://docs.sonarqube.org/latest/analysis/analysis-parameters/).

## Run analysis

Use the following commands from the root folder to start an analysis:

```bash
# Run the analysis and publish to the SonarQube server
$ sonar-scanner
```

## Contributing

Any help is welcome, and PRs will be greatly appreciated!

Have a look at the [developer guide](https://github.com/insideapp-oss/sonar-apple/blob/main/DEVELOP.md) to get started.

## License

This plugin is released under the GNU LGPL v3 license. See the [LICENSE](https://github.com/insideapp-oss/sonar-apple/blob/main/LICENSE.md) file for more information.