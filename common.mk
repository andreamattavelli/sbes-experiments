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
## JAVA8
##
# Linux (research / allegro)
JAVA8ROOT=/tools/jdk1.8.0_20
# Mac (with java 1.6)
#JAVA8ROOT=/Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home/
#JAVA8ROOT=/System/Library/Frameworks/JavaVM.framework/Versions/Current

# set java paths depending on the operating system
JAVA8BINDIR=$(JAVA8ROOT)/bin
JAVA8LIBDIR=$(JAVA8ROOT)/jre/lib
export JAVA_HOME=$(JAVA8ROOT)
JAVA8=$(JAVA8BINDIR)/java
JAVAC8=$(JAVA8BINDIR)/javac
JAR8=$(JAVA8BINDIR)/jar

##
## JAVA7 (for EvoSuite)
##
JAVA7ROOT=/tools/jdk1.7.0_05
#JAVA7ROOT=/Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/
JAVA7BINDIR=$(JAVA7ROOT)/bin
JAVA7LIBDIR=$(JAVA7ROOT)/jre/lib
JAVAC7=$(JAVA7BINDIR)/javac
JAR7=$(JAVA7BINDIR)/jar

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
SBESLIBROOT=$(TOOLS)/sbes-lib
SBESLIBJAR=$(SBESLIBROOT)/sbes-lib.jar
SBESLIBS=$(SBESROOT)/lib/args4j-2.32.jar:$(SBESROOT)/lib/asm-5.0.4.jar:$(SBESROOT)/lib/hamcrest.jar:$(SBESROOT)/lib/javaparser-1.0.10.jar:$(SBESROOT)/lib/jbse-0.7.jar:$(SBESROOT)/lib/junit.jar:$(SBESROOT)/lib/javassist.jar:$(SBESROOT)/lib/prologbeans.jar:$(SBESROOT)/lib/minijdd_103.jar
SYNTHESIS_BUDGET=270
COUNTEREXAMPLE_BUDGET=180
JBSE=$(TOOLS)/jbse/bin

##
## JUNIT
##
JUNIT=$(TOOLS)/junit.jar

##
## EVOSUITE
##
EVOSUITEROOT=$(TOOLS)/evosuite
EVOSUITEJAR=$(EVOSUITEROOT)/target/evosuite-0.1-SNAPSHOT-jar-minimal.jar
EVOSUITEREPO=https://bitbucket.org/andreamattavelli/evosuite-sbes

##
## Z3
##
Z3ROOT=$(TOOLS)/z3
Z3BIN=$(TOOLS)/z3/build
