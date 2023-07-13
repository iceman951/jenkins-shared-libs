def call() {
    echo "example1 shared libs jenkins"
    return this
}

def example2() {
    echo "echo example2 shared libs jenkins"
}

properties([
    parameters([
        [$class: 'DynamicReferenceParameter', name: 'Environment', choiceType: 'ET_FORMATTED_HTML', omitValueField: false, script: [$class: 'GroovyScript', script: [classpath: [], oldScript: '', sandbox: true, script: """ return "<h1> naja </h1>" """]]],
    ])
])