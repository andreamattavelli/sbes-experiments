# -*- Makefile -*-
##
## Framework-wide configuration
##
## NOTE:  this file will be included by the specific makefiles
##
## the only thing that we assume here is that the specific makefile
## defines the ROOT directory of the experimentation framework, which
## is the directory where this file resides.

##
## ROOT PATHS
##
EXPERIMENTS=$(ROOT)/experiments
LIBS=$(ROOT)/libraries
TOOLS=$(ROOT)/tools

##
## CONFIGURATIONS
##
default: all

##
## OTHER COMMANDS
##
UNAME=$(shell uname)
SHELL:=/bin/bash

##
## JAVA
##
# Linux (research / allegro)
JAVAROOT=/tools/jdk1.7.0_05
# Mac (with java 1.6)
#JAVAROOT=/System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents
#JAVAROOT=/System/Library/Frameworks/JavaVM.framework/Versions/Current

# set java paths depending on the operating system
ifeq ($(UNAME),Darwin)
JAVABINDIR=$(JAVAROOT)/Commands
JAVALIBDIR=$(JAVAROOT)/Resources
export JAVA_HOME=$(/usr/libexec/java_home)
else
JAVABINDIR=$(JAVAROOT)/bin
JAVALIBDIR=$(JAVAROOT)/jre/lib
export JAVA_HOME=$(JAVAROOT)
endif

JAVA=$(JAVABINDIR)/java
JAVAC=$(JAVABINDIR)/javac
JAR=$(JAVABINDIR)/jar

## 
## ANT
##
ANT=/usr/bin/ant

##
## MAVEN
##
MAVEN=/usr/bin/mvn


##
## SBES
##
SBESROOT=$(TOOLS)/sbes
SBESJAR=$(SBESROOT)/sbes.jar
SBESLIBS=$(SBESROOT)/lib/args4j-2.0.21.jar:$(SBESROOT)/lib/javaparser-1.0.10.jar:$(SBESROOT)/lib/asm-4.2.jar
SYNTHESIS_BUDGET=270
COUNTEREXAMPLE_BUDGET=180

##
## JUNIT
##
JUNIT=$(TOOLS)/junit.jar

##
## EVOSUITE
##
EVOSUITEROOT=$(TOOLS)/evosuite
EVOSUITEJAR=$(EVOSUITEROOT)/target/evosuite-0.1-SNAPSHOT-jar-minimal.jar
EVOSUITEREPO=https://andreamattavelli@bitbucket.org/andreamattavelli/evosuite-sbes
