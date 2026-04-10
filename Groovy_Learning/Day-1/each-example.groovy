servers = ['IAP-Prod', 'IAP-Dev', 'IAP-Test']

servers.each {
  println "Deploing into server: ${it}"
}

// in pipeline we will write like this
pipeline {
  agent any
  stages {
    stage('Deploy') {
      steps {
        echo 'Inside Step 1'
        script {
          def servers = ['IAP-Prod', 'IAP-Dev', 'IAP-Test']
          servers.each {
            println "Deploing into server: ${it}"
          }
        }
      }
    }
  }
}