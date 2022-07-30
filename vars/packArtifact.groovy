def call(Map config = [:]) {
    
     def filename =  "${config.name}_${env.BUILD_NUMBER}_${env.BUILD_ID}.zip"
     echo "Start Pack ${filename} "
     zip zipFile: filename, archive: false, dir: 'dist/'
     archiveArtifacts artifacts: filename, fingerprint: true
         echo "End Pack ${filename} "
}