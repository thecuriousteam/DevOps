pipeline {
    agent any

    stages {
        stage('Deploy') {
            steps {
                script {

                    servers = ["dev","test","prod"]
                    servers.each {
                        if(it == "prod"){
                            echo "Deploying to Production: ${it}"
                        } 
                    }
                }
            }
        }
    }
}

// pipeline revamp

// global variable
def envs = [
                        "dev": "IAP-Dev",
                        "test": "IAP-Test",
                        "prod": "IAP-Prod"
                    ]

def targetEnv=""
pipeline{
    agent any
    stages{
        stage("GetEnv"){
            steps{
                script{
                    echo "Selecting Environment"

                    envs.each{env, server -> if(env == "prod"){echo "Deploying to Production: ${server}"}}

                    targetEnv = env
                }
            }
        }
        stage("deploy"){
            steps{
                echo "Deploying code to server ${envs[targetEnv]}"
            }
        }

        stage("hosting"){
            steps{
                echo "Hosted the code to server"
            }
        }
    }
}