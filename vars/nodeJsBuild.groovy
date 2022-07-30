def call(Map config) {
    sh 'npm install'
    sh 'npm build'
}