/*
 * SonarQube Apple Plugin - Enables analysis of Swift and Objective-C projects into SonarQube.
 * Copyright © 2022 inside|app (contact@insideapp.fr)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import commons.ConsoleString
import commons.RuleUpdater

@Grab(group = 'org.codehaus.groovy.modules.http-builder', module = 'http-builder', version = '0.7.1')
import groovyx.net.http.HTTPBuilder
@Grab(group = 'org.codehaus.groovy', module = 'groovy-yaml', version = '3.0.10')
import groovy.yaml.YamlSlurper
import groovy.transform.Field

String.mixin(ConsoleString)

@Field def SEVERITY = [
        "ERROR": "CRITICAL",
        "WARNING": "MAJOR",
        "INFO": "INFO"
]

@Field def VERSION = "0.1.0"
@Field def URL = "https://raw.githubusercontent.com/MobSF/mobsfscan/${VERSION}/mobsfscan/rules/patterns/ios/"

def parseCategory(url) {

    def result = []

    def http = new HTTPBuilder(url)
    def htmlContent = http.get(contentType : 'text/html').text()
    def ys = new YamlSlurper()
    def rulesParsed = ys.parseText(htmlContent)

    for(Map rule : rulesParsed) {
        def entry = [:]
        entry.key = rule.id
        println "Processing rule ${entry.key.style(ConsoleString.Color.DEFAULT_BOLD)}"
        entry.description = rule.message
        entry.severity = SEVERITY[rule.severity]
        // type is hardcoded same as mobsfscan
        // see https://github.com/MobSF/mobsfscan/blob/main/mobsfscan/formatters/sonarqube.py#L48
        entry.type = "VULNERABILITY"
        result.add entry
    }

    return result
}

@Field def LANGUAGE_RULES = [
        "swift": ["swift", "swift"],
        "objc": ["objectivec", "objective_c"]
]

LANGUAGE_RULES.forEach( (key, value) -> {

    def updater = new RuleUpdater("${key}-lang/src/main/resources/${key}-mobsfscan-rules.json", {

        def result = []

        result.addAll parseCategory(URL + "${value.get(0)}/${value.get(1)}_rules.yaml")
        result.addAll parseCategory(URL + "${value.get(0)}/best_practices.yaml")

        return result
    })

    updater.update()

})