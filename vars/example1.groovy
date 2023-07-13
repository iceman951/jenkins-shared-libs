def call() {
    echo "example1 shared libs jenkins"
    properties([
        parameters([
            [$class: 'DynamicReferenceParameter', name: 'Environment', choiceType: 'ET_FORMATTED_HTML', omitValueField: false, script: [$class: 'GroovyScript', script: [classpath: [], oldScript: '', sandbox: true, script: """ return "<h1> naja </h1>" """]]],
        ])
    ])
    parameters {
        string(name: 'PARAM1', defaultValue: 'Default value 1', description: 'Parameter 1')
        choice(name: 'PARAM2', choices: ['Option 1', 'Option 2', 'Option 3'], description: 'Parameter 2')
    }
    booleanParam(name: 'RELOAD_CONFIG', defaultValue: false, description: 'if this option is selected deployment will be rolling update cause deployment to have a downtime')
    return this
}

def example2() {
    echo "echo example2 shared libs jenkins"
}