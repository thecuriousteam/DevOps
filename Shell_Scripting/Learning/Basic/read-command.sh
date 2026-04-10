#!/bin/bash

# giving value from the cmd -> user input
read myShell
echo "Your shell is $myShell"

read -p "Enter your shell: " myShell #this prompts user with message
echo "Your shell is $myShell"

read -rp "Enter your shell: " myShell #this prompts user with message and reads the input in the same line
echo "Your shell is $myShell"

# reading password from the user -> -s flag hides the input and use echo to go to next line
read -srp "Enter your password: " password
echo

#REPLY variable -> it is a special variable that stores the input from the user
read -p "Enter your name: "
echo "Your name is $REPLY"