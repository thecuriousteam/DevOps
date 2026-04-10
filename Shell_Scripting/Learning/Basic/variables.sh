#!/bin/bash

# variables are used to store data
# operators in shell scripting are +, -, *, /, %, =, ==, !=, <, >, <=, >=, &&, ||, !

name="John"
echo $name

# variables are case sensitive
NAME="John"
echo $NAME

# variables can be used to store data
age=20
echo $age

a=20
b=30
c=$((a+b))
echo "The value of c is $c" #format specifier 

# variable can hold anything
a=3
b=4.0
c=r
d=bash
e=/bin/bash
f=$(uname) #stores the output of the command in the variable
echo "The value of f is $f"
g=`uname -a` #stores the output of the command in the variable
echo "The value of g is $g"

# variable value can be taken in two ways
echo $f
echo ${f} 

# we can display the value using cat command

cat << EOF
${f}
EOF


# assign one variable value to another variable

s = 100
t = $s 
echo "The value of t is $t"

# default value of a variable is null

# reassignment of a variable
avalue=10
echo "The value of avalue is $avalue"
avalue=30.0
echo "The value of avalue is $avalue"

# unset -> a command to delete a variable value

unset avalue
echo "The value of avalue is $avalue"

# the scope of a variable is the current shell, it will not work outside the shell