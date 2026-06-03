// maps - key:value pairs
def emp = [
    name: "Nandan",
    role: "DevOps Engineer",
    exp: 3
]

print emp

// accessing values
println emp.name
println emp["name"]

// add new key:value pair
emp.location = "Bangalore"
print emp

// update value 
emp.exp = 4
print emp

// remove key:value pair
emp.remove("location")
print emp

// looping map
emp.each {key, value -> 

println "${key}: ${value}"}
emp.each { key, value ->
    println "$key -> $value"
}

// keysSet() -> returns a set of keys
emp.keySet().each{
  println "Key: $it"
}

// values() -> returns a list of values
emp.values().each{
  println "Value: $it"
}

//  check key and value exists or not
println emp.containsKey("name")
println emp.containsValue("Nandan")
println emp.size()

node {
  def app = [
    name: "Todo App",
    version: "1.0",
    dependencies: ["spring-boot", "spring-data-jpa", "spring-security"]
  ]

  stage('Build') {
    echo "Building the application"

    sh """
    echo Building the application ${app.name} version ${app.version}
    echo fetching dependencies
    """

    app.dependencies.each {
      sh """
          echo "Building Dependency: ${it}"
          sleep 2
          echo "Building Dependency: ${it} completed"
      """
    
    }
    echo "Building all dependencies completed"


    for(Dependency in app.dependencies){
      sh """
        echo "Method 2: Building Dependency: ${Dependency}"
        sleep 2
        echo "Method 2: Building Dependency: ${Dependency} completed"
      """
    }
    echo "Building all dependencies completed"
    }
  }