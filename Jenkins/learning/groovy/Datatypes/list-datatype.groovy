// literal list
def fruits = ['apple', 'banana', 'cherry']

// typed list
List<String> fruits2 = ['apple', 'banana', 'cherry']

// empty list
def empty=[]

// dynamic list
def mixed = ['apple', 1, true, '3.14']


// accessing, indexing & slicing
def items = ['a','b','c','d','e']

items[0] // 'a'
items[1] // 'b'
items[2] // 'c'

items[-1] // 'e'
items[-2] // 'd'

println items[0]
println items[1]
println items[2]
println items[-1]
println items[-2]


// adding & removing

// left shift add
items << 'f' // ['a','b','c','d','e','f']
items.add('g')

// add multiple elements
items.addAll(['h','i','j'])
println items

// remove element by index
items.remove(0)
println "items after removing index 0: ${items}"

// remove element by value
items.remove('g')
println "items after removing g: ${items}"


// set item by index
items[0] = 'a'
println "items after setting index 0 to a: ${items}"

// range & slicing
def sliced = items[1..3] // ['b','c','d']
println sliced

def sliced2 = items[0,2,4]
println sliced2

// iterations
items.each {
  println "Item: ${it}"
}

// iteration with index
items.eachWithIndex { val, idx -> 
  println "Item: ${val} at index: ${idx}" 
}

// find & search
def list = [10, 20, 30, 40, 50]
def found = list .find { it > 30 } // find nearest matching only

println "Found: ${found}"

def found2 = list.findAll { it > 30 } // find all matching elements
println "Found: ${found2}"

// filter
def filtered = list.findAll {it % 2 == 0} // find all even numbers
println "Filtered: ${filtered}"

// conditions
println list.any {it > 30} // true if any element is greater than 30

println list.every {it>30} // true if all elements are greater than 30

// join
def joined = list.join(',')
println "Joined: ${joined}"

// split
def split = joined.split(',')
println "Split: ${split}"

// contains
println list.contains(30) // true if list contains 30

// indexOf
def index = list.indexOf(30)
println "Index of 30: ${index}"