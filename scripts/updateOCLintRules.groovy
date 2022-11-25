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

@Grab(group = 'org.codehaus.groovy.modules.http-builder', module = 'http-builder', version = '0.7')
import groovyx.net.http.HTTPBuilder

String.mixin(ConsoleString)


def splitCamelCase(value) {
    value.replaceAll(
            String.format("%s|%s|%s",
                    "(?<=[A-Z])(?=[A-Z][a-z])",
                    "(?<=[^A-Z])(?=[A-Z])",
                    "(?<=[A-Za-z])(?=[^A-Za-z])"
            ),
            " "
    ).toLowerCase()
}


private def ArrayList<Rule> parseCategory(url, name) {

    def rules = [] as ArrayList<Rule>

    def http = new HTTPBuilder(url)
    def html = http.get([:])

    def root = html."**".find { it.@id.toString().contains(name) }
    root."**".findAll { it.@class.toString() == 'section' }.each { rawRule ->

        // Name
        def ruleName = splitCamelCase(rawRule.H2.text() - '¶').capitalize()

        if (ruleName != '') {
            // Key
            def ruleKey = ruleName.replaceAll(' ', '-').toLowerCase()

            println "Processing rule ${ruleKey.style(ConsoleString.Color.DEFAULT_BOLD)}"

            // Summary
            def ruleDescription = rawRule.P[2].text()

            def rule = new Rule(
                    ruleKey,
                    ruleDescription,
                    null, // no severity
                    null, // not type
                    ruleName,
                    null // no debt
            )
            rules.add rule
        }
    }

    return rules
}

def updater = new RuleUpdater('objc-lang/src/main/resources/oclint/rules.json', {

    def rules = [] as ArrayList<Rule>

    rules.addAll parseCategory("http://docs.oclint.org/en/stable/rules/basic.html", "basic")
    rules.addAll parseCategory("http://docs.oclint.org/en/stable/rules/cocoa.html", "cocoa")
    rules.addAll parseCategory("http://docs.oclint.org/en/stable/rules/convention.html", "convention")
    rules.addAll parseCategory("http://docs.oclint.org/en/stable/rules/cuda.html", "cuda")
    rules.addAll parseCategory("http://docs.oclint.org/en/stable/rules/design.html", "design")
    rules.addAll parseCategory("http://docs.oclint.org/en/stable/rules/empty.html", "empty")
    rules.addAll parseCategory("http://docs.oclint.org/en/stable/rules/migration.html", "migration")
    rules.addAll parseCategory("http://docs.oclint.org/en/stable/rules/naming.html", "naming")
    rules.addAll parseCategory("http://docs.oclint.org/en/stable/rules/redundant.html", "redundant")
    rules.addAll parseCategory("http://docs.oclint.org/en/stable/rules/size.html", "size")
    rules.addAll parseCategory("http://docs.oclint.org/en/stable/rules/unused.html", "unused")

    return rules
})

updater.update()