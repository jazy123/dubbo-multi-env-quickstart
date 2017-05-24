#!/bin/sh

scriptPath=$(cd `dirname $0` ; pwd)
echo "scriptPath is "$scriptPath

pidFile=$scriptPath"/run.pid"
echo "pid-file is "$pidFile

if [ ! -f "$pidFile" ]; then
  echo "pid-file"$pidFile" is not exists."
  exit 0
else
  echo "pid-file="$pidFile" is exists."
fi

pid=$(cat ${pidFile})
echo "PID is "${pid}

pnum=`ps -ax | awk '{ print $1 }' | grep -e "^${pid}$"`

if [ -z ${pnum} ] ; then
   echo  "there isn't this process!"
else
   kill $pid
   echo "kill pid = "$pid
fi

#rm $pidFile
#echo "delete file = $pidFile"
exit
