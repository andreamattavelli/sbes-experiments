#!/bin/bash -x

###############################################################################
# Environmental settings
###############################################################################
LIBRARIES=(colt commons-primitives guava graphstream java)
CLASSPATH="tools/junit.jar:libraries/colt-1.2.jar:libraries/commons-primitives-1.1.jar:libraries/gs-core-1.2.jar:libraries/guava-12.0.1.jar:libraries/stack.jar"

###############################################################################
# Compile Java library
###############################################################################
cd libraries/java/src; \
SOURCES=`find -L . -name \*.java`; \
javac -g $SOURCES; \
jar cf stack.jar stack/*; \
mv stack.jar ../..; \
cd ../../..

###############################################################################
# Run compilation for all the InitialScenario.java found
###############################################################################
RETURN_VALUE=0
for case in ${LIBRARIES[@]}; do
  for file in `find experiments/$case -name "InitialScenario.java"`; do
    echo $file | cut -d '/' -f4
    javac -cp $CLASSPATH $file
    if [ $? -ne 0 ]; then
    	RETURN_VALUE=1
    fi
  done
done

exit $RETURN_VALUE
