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
package common

/**
 * Utility class to handle stdin prompts.
 */
class Prompt {

    private question
    private choices

    Prompt(question, String... choices) {
        this.question = question
        this.choices = choices
    }

    /**
     * Prompts for choice.
     * @return Selected choice
     */
    def promptChoice() {
        use(ConsoleString) {
            def display = "${question} ("
            this.choices.eachWithIndex { c, i ->
                display += "${i + 1} = ${c}"
                if (i < choices.length - 1) {
                    display += ", "
                }
            }
            display += ")"
            println display

            def answer = System.in.newReader().readLine()
            def error = false
            try {
                def intAnswer = Integer.parseInt(answer)
                if (intAnswer < 1 || intAnswer > choices.length) {
                    error = true
                } else {
                    return choices[intAnswer - 1]
                }
            } catch (e) {
                error = true
            }

            if (error) {
                println "Invalid choice".style(ConsoleString.Color.RED)
                return this.prompt()
            }
        }
    }

    /**
     * Prompts for duration.
     * @return Duration formatted as {X}min
     */
    def promptDuration() {
        use(ConsoleString) {
            println "${question} (in minutes)"
        }

        def answer = System.in.newReader().readLine()
        def error = false
        try {
            def intAnswer = Integer.parseInt(answer)
            if (intAnswer < 1) {
                error = true
            } else {
                return "${intAnswer}min"
            }
        } catch (e) {
            error = true
        }

        if (error) {
            println "Invalid value".style(ConsoleString.Color.RED)
            return this.prompt()
        }
    }
}