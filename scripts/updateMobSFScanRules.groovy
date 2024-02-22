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
import commons.Rule

@Grab(group = 'org.codehaus.groovy.modules.http-builder', module = 'http-builder', version = '0.7.1')
import groovyx.net.http.HTTPBuilder
@Grab(group = 'org.codehaus.groovy', module = 'groovy-yaml', version = '3.0.10')
import groovy.yaml.YamlSlurper
import groovy.transform.Field

String.mixin(ConsoleString)

@Field def SEVERITY_MAP = [
        "ERROR": Rule.Severity.CRITICAL,
        "WARNING": Rule.Severity.MAJOR,
        "INFO": Rule.Severity.INFO
] as LinkedHashMap<String, Rule.Severity>

@Field def VERSION = "0.3.4"
@Field def URL = "https://raw.githubusercontent.com/MobSF/mobsfscan/${VERSION}/mobsfscan/rules/patterns/ios/"

private ArrayList<Rule> parseCategory(url) {

    def rules = [] as ArrayList<Rule>

    def http = new HTTPBuilder(url)
    def htmlContent = http.get(contentType : 'text/html').text()
    def ys = new YamlSlurper()
    def rulesParsed = ys.parseText(htmlContent)

    for(Map ruleParsed : rulesParsed) {
        println "Processing rule ${ruleParsed.id.style(ConsoleString.Color.DEFAULT_BOLD)}"
        // type to VULNERABILITY is hardcoded same as mobsfscan
        // see https://github.com/MobSF/mobsfscan/blob/main/mobsfscan/formatters/sonarqube.py#L48
        def rule = new Rule(
                ruleParsed.id,
                ruleParsed.message,
                SEVERITY_MAP[ruleParsed.severity],
                Rule.Type.VULNERABILITY,
                null, // no name
                null // no debt
        )
        rules.add rule
    }
    return rules
}

@Field def LANGUAGE_RULES = [
        "swift": ["swift", "swift"],
        "objc": ["objectivec", "objective_c"]
]

LANGUAGE_RULES.forEach( (key, value) -> {

    def updater = new RuleUpdater("${key}-lang/src/main/resources/mobsfscan/${key}-rules.json", {
        def rules = [] as ArrayList<Rule>
        rules.addAll parseCategory(URL + "${value.get(0)}/${value.get(1)}_rules.yaml")
        rules.addAll parseCategory(URL + "${value.get(0)}/best_practices.yaml")
        return rules
    })

    updater.update()

})