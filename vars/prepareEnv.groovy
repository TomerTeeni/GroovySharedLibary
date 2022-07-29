def call(Map config = [:]) {
    sh "echo Hello commiter ${config.name}."
    sh "npm install"
}