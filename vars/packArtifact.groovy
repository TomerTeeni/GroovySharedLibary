def call(Map config = [:]) {
     echo "Pack ${env.BUILD_NUMBER} "
   //  sh 'rm archive'
   //  sh 'mkdir archive'
   //  sh 'echo test > archive/test.txt'
     zip zipFile: "test_${env.BUILD_NUMBER}.zip", archive: false, dir: 'dist/'
     archiveArtifacts artifacts: "test_${env.BUILD_NUMBER}.zip", fingerprint: true
}