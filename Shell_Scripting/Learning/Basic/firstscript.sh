#!/bin/bash 
#tells what type of script it is (shebang line)

java --version

sleep 4 # wait for 4 seconds
docker --version  
git --version
python --version
node --version
npm --version

# ways of executing the script
# 1. Give execute permission to the script ./firstscript.sh then run
# 2. bash firstscript.sh (shebang line & execute permission is not needed)