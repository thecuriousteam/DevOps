def name = "Nandan"

println 'Hello ${name}'   // no interpolation
println "Hello ${name}"   // interpolation works

println name.toUpperCase()
println name.toLowerCase()

// checking length
println name.length()

// we can call method inside the string interpolation
println "Length of name is ${name.length()}"

// we can call method inside the string interpolation
println "Length of name is ${name.toUpperCase()}"

// we can call method inside the string interpolation
println "Length of name is ${name.toLowerCase()}"

// we can call method inside the string interpolation
println "Length of name is ${name.length()}"


// checking contains
println name.contains("Nand")

// replace 
println name.replace("Nandan", "Nandan G N")

// split
def env = "dev,qa,prod"
println env.split(',')

def namespace = "default"
sh "kubectl get pods -n ${namespace}"

