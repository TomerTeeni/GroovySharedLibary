def call(Map config = [:]) {
     echo "Pack ${env.BUILD_NUMBER} "
     sh 'mkdir archive'
     sh 'echo test > archive/test.txt'
     zip zipFile: 'test.zip', archive: false, dir: 'archive'
     archiveArtifacts artifacts: 'test.zip', fingerprint: true
}