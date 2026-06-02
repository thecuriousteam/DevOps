// list
def envs = ["dev", "qa", "uat", "prod"]
println envs

// typed list
List<String> envs2 = ["dev", "qa", "uat", "prod"]
println envs2

// adding elements to list
envs.add("stage")
println envs

// accessing list
println envs[2]

// updating list
envs[3] = "production"
println envs

// deleting list
envs.remove(2)
println envs

// size of list
println envs.size()

// iterating list
envs.each {
  println "Deploying to environment: ${it}"
}

// iterating list with index
envs.eachWithIndex { val, index -> println "Deploying to environment: ${val} at index: ${index}"}


// find -> Find first matching element.
def deployEnv = envs.find {it=="dev"} 
println "Deploying to environment: ${deployEnv}"

// findAll -> Find all matching elements.
def requiredEnvs = envs.findAll {it=="dev"} 
println "Required environments: ${requiredEnvs}"