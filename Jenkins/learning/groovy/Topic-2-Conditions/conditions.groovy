def env =  "dev"

// if statement
if(env == "dev"){
  println "Deploying to dev environment"
}

// if else statement
if(env == "dev"){
  println "Deploying to dev environment"
} else {
  println "Deploying to non-dev environment"
}

// if else if statement
if(env == "dev"){
  println "Deploying to dev environment"
} else if(env == "qa"){
  println "Deploying to qa environment"
} else if(env == "prod"){
  println "Deploying to production environment"
} else {
  println "Invalid environment"
}

// switch statement
switch(env){
  case "dev":
  println "Deploying to dev environment"
  break
  case "qa":
  println "Deploying to qa environment"
  break
  case "prod":
  println "Deploying to production environment"
  break
  default:
  println "Invalid environment"
  break
}


// jenkins script
node {
  def nginxPod = """
  apiVersion: v1
  kind: Pod
  metadata:
    labels:
      run: nginx-pod
    name: nginx-pod
  spec:
    containers:
      - image: nginx
        name: nginx-pod
        ports:
          - containerPort: 80
  """

  // create yaml file
  stage('Create Yaml File'){

    writeFile file: 'nginx-pod.yaml', text: nginxPod
  }

  stage('Create Nginx Pod'){
    sh '''
    kubectl apply -f nginx-pod.yaml
    '''
  }

  stage('Wait for Pod to be Ready'){

    sh '''
    kubectl wait --for=condition=ready pod/nginx-pod --timeout=120s
    '''
  }

  stage("Check Pod Status"){
    sh 'kubectl get pods -o wide'
  }

// we check the pipeline status and based on that we will print the message
  stage("Pipeline Status"){

    switch(currentBuild.currentResult){

      case 'SUCCESS':
      println "Pipeline completed successfully"
      break
      case 'FAILURE':
      println "Pipeline completed with failure"
      break
      case 'UNSTABLE':
      println "Pipeline completed with unstable"
      break
      case 'ABORTED':
      println "Pipeline completed with aborted"
      break
      default:
      println "Pipeline completed with unknown status"
      break
    }
  }
}