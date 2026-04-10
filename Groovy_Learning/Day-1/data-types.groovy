// variables
envName = 'production'
version = '1.0'

// number
port = 8080

// list
servers = ['IAP-Prod', 'IAP-Dev', 'IAP-Test']

// map
environments = [
  'production': 'IAP-Prod',
  'development': 'IAP-Dev',
  'testing': 'IAP-Test'
]
// accessing map
println environments['production']
println environments.development
println environments.'development'

// null
envName = null

// boolean
isActive = true

// condition
if (isActive) {
  println 'Server is active'
} else {
  println 'Server is not active'
}

// looping
servers.each {
  println "Server: ${it}"
}