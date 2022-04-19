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

String.mixin(ConsoleString)

def updater = new RuleUpdater('swift-lang/src/main/resources/swiftlint-rules.json', {

    def result = []

    def processRules = "swiftlint rules".execute()
    // Extract rule identifiers
    processRules.text.eachLine { line ->

        def rule = [:]


        if (!line.startsWith('+')) {

            def matcher = line =~ /\| (\w+)/

            rule.key = matcher[0][1]

            if (rule.key != 'identifier') {
                result.add rule
            }
        }

    }

    // Get details of each rule
    result.each { rule ->
        def processRuleDetails = "swiftlint rules ${rule.key}".execute()
        def details = processRuleDetails.text.readLines().first()

        println "Processing rule ${rule.key.style(ConsoleString.Color.DEFAULT_BOLD)}"

        def matcher = details =~ /(.*) \((\w+)\): (.*)/
        rule.name = matcher[0][1] - ' Rule'
        rule.description = matcher[0][3]

    }

    return result
})

updater.update()
