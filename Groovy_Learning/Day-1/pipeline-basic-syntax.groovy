// string
server = 'IAP-Prod'

pipeline {
  agent any
  stages {
    stage('Clone') {
      steps {
        echo 'This is clone stage'
        // string interpolation
        echo "Server: ${server}"
      }
    }
    stage('Build') {
      steps {
        echo 'This is build stage'
      }
    }
    stage('Deploy') {
      steps {
        echo 'This is deploy stage'
      }
    }
  }
}