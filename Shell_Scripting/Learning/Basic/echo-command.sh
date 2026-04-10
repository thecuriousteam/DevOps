# providing input to the variable
# 1. Directly define the value to the variable
# 2. using read command
# 2. using source concept
# 3. using export command
# 4. using command line arguments
# 5. using options with the help of while loop

# display values in different ways
# 1. echo
# 2. cat command with here-doc
# 3. printf

# echo command usage in bash
# syntax - echo [option-> -neE] [arguments]
x=10
echo "Value of x is $x"
echo ${x}

myValue=143
myShell=bash
echo ${myValue}
echo ${myShell}
echo ${myValue} ${myShell}

# command output to the variable
# passing command output to the variable we need to use $(command)
myCmd=$(date)
echo "Date is $myCmd"
echo ${myCmd}
echo $(uname -a)
echo $(pwd && ls -la)

echo Hello from $(uname) at ${myCmd}

myCmd=$(date)
echo "Date is $myCmd" #"" -> treats as a variable
echo 'Date is $myCmd'  #'' -> treats as a string


dockerVersion=$(docker --version | cut -d ' ' -f3 | tr -d ",")
echo "Docker version is $dockerVersion"
javaVersion=$(java --version | awk 'NR==1 {print $2}')
echo "Java version is $javaVersion"

echo "----------------------------------"
echo "| ToolName | Version             |"
echo "|--------------------------------|"
echo "| Docker   | $dockerVersion              |"
echo "|--------------------------------|"
echo "| Java     | $javaVersion             |"
echo "----------------------------------"

