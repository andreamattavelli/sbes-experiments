ROOT=../../..
include $(ROOT)/common.mk
include conf.mk

.SILENT:

.PHONY: help
help:
	@for line in \
	"Main targets to run the experiments:" \
	"all: runs all the experiments"; \
	do echo "$$line" ; done

.PHONY: all
all: experiment

SBESROOT=../../sbes
SBESBIN=$(SBESROOT)/bin
SBESLIBS=$(SBESROOT)/lib/args4j-2.0.21.jar:$(SBESROOT)/lib/javaparser-1.0.10.jar

ITERATIONS:=$(shell cat iterations)
RUN_ITERATIONS:=$(ITERATIONS:%=run_%)

experiment: $(RUN_ITERATIONS)

run_%:
        @echo "Running SBES, iteration $*"
        -test -d $@ || mkdir $@
        -cd $@ ; $(JAVA) -cp $(SBESBIN):$(SBESLIBS) sbes.SBES \
        --classes=../../GraphStream-UseCase/lib/gs-core-1.2.jar \
        --method=org.graphstream.graph.implementations.AbstractEdge.getNode0[] \
        --search_budget=180 \
        --junit=../../junit-4.11.jar \
        --evosuite=../../evosuite.jar \
        --java=$(JAVABIN) > $@.txt 2>&1

clean:
        rm -rf run_* org.*

