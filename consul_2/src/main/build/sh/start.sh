#!/bin/sh

echo 'start >>>>>>>';

cd /mnt/gagc/

projectName=discovery-consul-1

versionName=-1.0.0

cd /mnt/gagc/$projectName$versionName

jar=$projectName''$versionName'.jar'

pid=`ps -ef | grep $jar | grep -v grep | awk '{print $2}'`

if [ -n "$pid" ]
then
   #!kill -9 强制终止
   echo "kill -9 -> pid: $pid"
   kill -9 $pid
fi

. /etc/profile

nohup java -jar *.jar -server -Xms128m -Xmx256m -XX:MaxPermSize=128m  > run.log 2>&1 &
echo 'start >>>>>>SUCCESS !!!!!'