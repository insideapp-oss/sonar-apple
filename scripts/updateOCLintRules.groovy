import commons.ConsoleString
import commons.RuleUpdater

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


def parseCategory(url, name) {

    def result = []

    def http = new HTTPBuilder(url)
    def html = http.get([:])

    def root = html."**".find { it.@id.toString().contains(name) }
    root."**".findAll { it.@class.toString() == 'section' }.each { rule ->

        def entry = [:]

        // Name
        entry.name = splitCamelCase(rule.H2.text() - '¶').capitalize()

        if (entry.name != '') {
            // Key
            entry.key = entry.name.replaceAll(' ', '-').toLowerCase()

            println "Processing rule ${entry.key.style(ConsoleString.Color.DEFAULT_BOLD)}"

            // Summary
            entry.description = rule.P[2].text()

            result.add entry
        }
    }

    return result
}

def updater = new RuleUpdater('objc-lang/src/main/resources/oclint-rules.json', {

    def result = []

    result.addAll parseCategory("http://docs.oclint.org/en/stable/rules/basic.html", "basic")
    result.addAll parseCategory("http://docs.oclint.org/en/stable/rules/cocoa.html", "cocoa")
    result.addAll parseCategory("http://docs.oclint.org/en/stable/rules/convention.html", "convention")
    result.addAll parseCategory("http://docs.oclint.org/en/stable/rules/cuda.html", "cuda")
    result.addAll parseCategory("http://docs.oclint.org/en/stable/rules/design.html", "design")
    result.addAll parseCategory("http://docs.oclint.org/en/stable/rules/empty.html", "empty")
    result.addAll parseCategory("http://docs.oclint.org/en/stable/rules/migration.html", "migration")
    result.addAll parseCategory("http://docs.oclint.org/en/stable/rules/naming.html", "naming")
    result.addAll parseCategory("http://docs.oclint.org/en/stable/rules/redundant.html", "redundant")
    result.addAll parseCategory("http://docs.oclint.org/en/stable/rules/size.html", "size")
    result.addAll parseCategory("http://docs.oclint.org/en/stable/rules/unused.html", "unused")

    return result
})

updater.update()