#!/bin/bash -x

LIBRARIES=(guava graphstream java)
CLASSPATH="tools/junit.jar:libraries/gs-core-1.2.jar:libraries/guava-12.0.1.jar:libraries/stack.jar"

###############################################################################
# Compile Java library
###############################################################################
JARNAME="stack.jar"
SOURCEDIR="libraries/java/src"

cd $SOURCEDIR; \
SOURCES=`find -L . -name \*.java`; \
javac -g $SOURCES; \
jar cf $JARNAME stack/*; \
mv $JARNAME ../..; \
cd ../../..

RETURN_VALUE=0
for case in $LIBRARIES; do
  for file in `find experiments/$case -name "InitialScenario.java"`; do
  	echo $file
    javac -cp $CLASSPATH $file
    if [ $? -ne 0 ]; then
    	RETURN_VALUE=1
    fi
  done
done

exit $RETURN_VALUE