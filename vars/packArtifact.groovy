def call(Map config = [:]) {
    
     def filename =  "test_${env.BUILD_NUMBER}_${env.BUILD_ID}"
     echo "Pack ${filename} "
     zip zipFile: "test_${filename}.zip", archive: false, dir: 'dist/'
     archiveArtifacts artifacts: "test_${filename}.zip", fingerprint: true
}