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


// FIXME : this is a temporary script to merge Sqale data with rules JSON file
// Should be deleted when all linters will be migrated

import groovy.json.JsonSlurper
import groovy.json.JsonBuilder

//print "What is your name? "
//def name = System.in.newReader().readLine()
//println "Your name is " + name

def rulesFile = new File('swift-lang/src/main/resources/fr/insideapp/sonarqube/swift/swiftlint/rules.json')
def sqaleFile = new File('swift-lang/src/main/resources/fr/insideapp/sonarqube/swift/swiftlint/model.xml')

def outFile = new File('swift-lang/src/main/resources/swiftlint-rules.json')

def jsonSlurper = new JsonSlurper()
def rules = jsonSlurper.parseText(rulesFile.getText('UTF-8'))

def sqale = new XmlSlurper().parseText(sqaleFile.getText('UTF-8'))

def outputRules = []

rules.each { r ->
    println r.name
    def outRule = [key: r.key, name: r.name, severity: r.severity, description: r.description]
    def debtInfo = sqale.'**'.find {it.name() == 'rule-key' && it.text() == r.key}
    if (debtInfo != null) {
        def fct = debtInfo.parent().prop[0].txt.text()
        def offset = debtInfo.parent().prop[1].val.text() + debtInfo.parent().prop[1].txt.text()
        println('>> ' + fct + ' - ' + offset)
        outRule.debt = [function: fct, offset: offset]
    } else {
        println '>> No debt info here !'
    }
    outputRules.add(outRule)
}

def builder = new JsonBuilder()
builder(outputRules)
outFile.text = builder.toPrettyString()