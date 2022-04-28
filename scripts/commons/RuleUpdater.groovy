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
package commons

import groovy.json.JsonSlurper
import groovy.json.JsonBuilder

/**
 * Rule updater: performs new rules retrieval, checks and update.
 */
class RuleUpdater {

    private File file
    private Closure fetchClosure

    /**
     * Constructor.
     * @param filePath Path to the current rules JSON file
     * @param fetchClosure Closure used to fetch rules from tool / repository
     */
    RuleUpdater(String filePath, Closure fetchClosure) {
        this.file = new File(filePath)
        this.fetchClosure = fetchClosure
    }

    /**
     * Read rules from file.
     * @return List of rules
     */
    private def readRules() {
        def jsonSlurper = new JsonSlurper()
        return jsonSlurper.parseText(file.getText('UTF-8'))
    }

    /**
     * Write rules to the rule file.
     * @param rules List of rules
     */
    private def writeRules(rules) {

        def builder = new JsonBuilder()
        builder(rules)
        file.text = builder.toPrettyString()

    }

    /**
     * Merge new rules with existing rules.
     * @param existingRules List of existing rules
     * @param newRules List of new rules
     * @return List of merged rules
     */
    private def mergeRules(existingRules, newRules) {

        def result = []

        // Add existing rules
        existingRules.each { r ->
            result.add(r)
        }

        // Add new rules, if they don't exist yet
        use(ConsoleString) {
            newRules.each { r ->
                def exists = existingRules.find { er -> er.key == r.key }
                if (!exists) {
                    println "Adding new rule ${r.key.style(ConsoleString.Color.DEFAULT_BOLD)}"
                    result.add(r)
                }
            }
        }

        return result
    }

    /**
     * Scan rules for missing manual info an prompt when missing
     * @param rules List of rules to check
     * @return List of rules (with all data completed)
     */
    def private requestManualInfo(rules) {

        def result = []

        use(ConsoleString) {
            rules.each { r ->

                if (r.severity == null || r.debt == null || r.type == null) {
                    println ""
                    println "Missing information on rule ${r.key}".style(ConsoleString.Color.YELLOW)
                    println "${r.description}".style(ConsoleString.Color.DEFAULT)
                    println ""
                    if (r.name == null) {
                        r.name = new Prompt("Name ?").promptText()
                        println r.name.style(ConsoleString.Color.DEFAULT_BOLD)
                    }
                    if (r.severity == null) {
                        r.severity = new Prompt("Severity ?", "BLOCKER", "CRITICAL", "MAJOR", "MINOR", "INFO").promptChoice()
                        println r.severity.style(ConsoleString.Color.DEFAULT_BOLD)
                    }
                    if (r.type == null) {
                        r.type = new Prompt("Type ?", "CODE_SMELL", "BUG", "VULNERABILITY", "SECURITY_HOTSPOT").promptChoice()
                        println r.type.style(ConsoleString.Color.DEFAULT_BOLD)
                    }
                    if (r.debt == null) {
                        def needDebt = new Prompt("Remediation time needed ?", "Yes", "No").promptChoice()
                        switch (needDebt) {
                            case "Yes":
                                def offset = new Prompt("Remediation time ?").promptDuration()
                                println offset.style(ConsoleString.Color.DEFAULT_BOLD)
                                r.debt = [offset: offset, function: "CONSTANT_ISSUE"]
                            case "No":
                                break
                        }
                    }

                }

                result.add(r)
            }
        }

        return result
    }

    /**
     * Performs rule update.
     */
    def update() {

        def existingRules = readRules()
        def newRules = fetchClosure.call()
        def mergedRules = mergeRules(existingRules, newRules)

        // Fill missing info
        def completedRules = requestManualInfo(mergedRules)

        writeRules(completedRules)
    }
}