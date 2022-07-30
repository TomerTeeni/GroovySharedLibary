def call(Map config) {
   checkout scm
   def url = sh(returnStdout: true, script: 'git config remote.origin.url').trim()
   git url
   echo "clonning Git"
}