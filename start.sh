#!/bin/bash
for i in ../*.jar
do
    CLASSPATH="$i:$CLASSPATH"
done

for i in ../lib/*.jar
do
    CLASSPATH="$i:$CLASSPATH"
done

CLASSPATH="../config:$CLASSPATH"

/home/app/jdk1.8.0_65/bin/java -cp $CLASSPATH  com.zcb.test.demo.Server $@ >> ../log/error.log 2>&1 &