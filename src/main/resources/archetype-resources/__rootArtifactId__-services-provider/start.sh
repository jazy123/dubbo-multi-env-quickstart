#!/bin/sh

scriptPath=$(cd `dirname $0`; pwd)
echo "dirPath is $scriptPath"

cd $scriptPath

jarFile=`ls *.jar`  
echo 'jarFile is '$jarFile
# make sure it is only one jar file in such directory

nohup java -jar $jarFile > server.log 2>&1 &
        
echo $! > run.pid
echo 'ok'
exit