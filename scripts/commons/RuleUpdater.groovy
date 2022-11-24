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
    def private Set<Rule> readRules() {
        def jsonSlurper = new groovy.json.JsonSlurper()
        return jsonSlurper.parseText(file.getText('UTF-8')) as Set<Rule>
    }

    /**
     * Write rules to the rule file.
     * @param rules List of rules
     */
    def private writeRules(ArrayList<Rule> rules) {
        def generator = new groovy.json.JsonGenerator.Options().excludeNulls().build()
        def json = new groovy.json.JsonBuilder(generator)
        json(rules) { rule ->
            key rule.key
            name rule.name
            severity rule.severity
            description rule.description
            type rule.type
            debt rule.debt
        }
        file.text = groovy.json.JsonOutput.prettyPrint(json.toString())
    }

    /**
     * Merge new rules with existing rules.
     * @param existingRules List of existing rules
     * @param newRules List of new rules
     * @return List of merged rules
     */
    def private ArrayList<Rule> mergeRules(ArrayList<Rule> existingRules, ArrayList<Rule> newRules) {

        def allRules = [] as ArrayList<Rule>

        // Add existing rules
        allRules.addAll(existingRules)

        // Add new rules, if they don't exist yet
        use(ConsoleString) {
            newRules.each { r ->
                def exists = existingRules.find { er -> er.key == r.key }
                if (!exists) {
                    println "Adding new rule ${r.key.style(ConsoleString.Color.DEFAULT_BOLD)}"
                    allRules.add(r)
                }
            }
        }

        return allRules
    }

    /**
     * Scan rules for missing manual info an prompt when missing
     * @param rules List of rules to check
     * @return List of rules (with all data completed)
     */
    def private requestManualInfo(ArrayList<Rule> rules) {

        def rulesCompleted = [] as ArrayList<Rule>

        use(ConsoleString) {
            rules.each { r ->

                if (r.severity == null || r.debt == null || r.type == null) {
                    println ""
                    println "Missing information on rule ${r.key}".style(ConsoleString.Color.YELLOW)
                    println "${r.description}".style(ConsoleString.Color.DEFAULT)
                    println ""
                    if (r.name == null) {
                        r.name = new Prompt("Name?", null).promptText()
                        println r.name.style(ConsoleString.Color.DEFAULT_BOLD)
                    }
                    if (r.severity == null) {
                        List<String> severities = Arrays.asList(Rule.Severity.values().each{ s -> s.name() });
                        def choice = new Prompt("Severity?", severities).promptChoice() as String
                        r.severity = Enum.valueOf(Rule.Severity.class, choice);
                        println r.severity.name().style(ConsoleString.Color.DEFAULT_BOLD)
                    }
                    if (r.type == null) {
                        List<String> types = Arrays.asList(Rule.Type.values().each{ s -> s.name() });
                        def choice = new Prompt("Type?", types).promptChoice() as String
                        r.type = Enum.valueOf(Rule.Type.class, choice);
                        println r.Type.name().style(ConsoleString.Color.DEFAULT_BOLD)
                    }
                    if (r.debt == null) {
                        def offset = new Prompt("Remediation time?", null).promptDuration()
                        println offset.style(ConsoleString.Color.DEFAULT_BOLD)
                        r.debt = offset
                    }

                }

                rulesCompleted.add(r)
            }
        }

        return rulesCompleted
    }

    /**
     * Performs rule update.
     */
    def update() {

        def existingRules = readRules() as ArrayList<Rule>
        println "Read ${existingRules.size()} existing rule(s) from file"

        println "Processing rules from tool"
        def rules = fetchClosure.call() as ArrayList<Rule>
        println "Read ${rules.size()} rule(s) from tool"

        def allRules = mergeRules(existingRules, rules) as ArrayList<Rule>
        println "${allRules.size()} rule(s) merged"

        // Fill missing info
        def completedRules = requestManualInfo(allRules) as ArrayList<Rule>
        println "${completedRules.size()} rule(s) about to be saved"

        writeRules(completedRules)
    }
}