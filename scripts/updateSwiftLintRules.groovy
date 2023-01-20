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
import commons.RuleUpdater
import commons.ConsoleString
import commons.Rule

String.mixin(ConsoleString)

def updater = new RuleUpdater('swift-lang/src/main/resources/swiftlint-rules.json', {

    def rulesKey = [] as ArrayList<String>

    def processRules = "swiftlint rules".execute()
    // Extract rule identifiers
    processRules.text.eachLine { line ->

        if (!line.startsWith('+')) {

            def matcher = line =~ /\| (\w+)/

            def key = matcher[0][1]

            if (key != 'identifier') {
                rulesKey.add key
            }
        }

    }

    def rules = [] as ArrayList<Rule>

    // Get details of each rule
    rulesKey.each { ruleKey ->
        def processRuleDetails = "swiftlint rules ${ruleKey}".execute()
        def details = processRuleDetails.text.readLines().first()

        println "Processing rule ${ruleKey.style(ConsoleString.Color.DEFAULT_BOLD)}"

        def matcher = details =~ /(.*) \((\w+)\): (.*)/
        def name = matcher[0][1] - ' Rule'
        def description = matcher[0][3]

        def rule = new Rule(
                ruleKey,
                description,
                null, // no severity
                null, // no type
                name,
                null // no debt
        )
        rules.add rule

    }

    return rules
})

updater.update()
