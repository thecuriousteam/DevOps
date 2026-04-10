pipeline{
  agent any
  stages{
    stage('Environment') {
      steps{

        script{

          def environments = ["dev": "IAP-Dev", "test": "IAP-Test", "prod": "IAP-Prod"]

          environments.each {key, value -> if(key=="prod"){echo "Deploying to Production: ${value}"}}
        }
      }
    }
  }
}