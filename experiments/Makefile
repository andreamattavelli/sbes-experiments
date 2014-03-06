ROOT=$(realpath ..)
include $(ROOT)/common.mk
include $(firstword $(subst /, ,$(CLASS)))/conf.mk

.SILENT:

.PHONY: help
help:
	@for line in \
	"Main targets to run the experiments:" \
	"all: runs all the experiments on the case study specified in the CLASS parameter." ; \
	"     For example, make CLASS=java/stack will run the experiments on the Java Stack. " ; \
	"" ; \
	"Clean targets:" ; \
	"clean: clean all the experiment for the class specified in the CLASS parameter." ; \
	"       For example, make clean CLASS=java/stack will clean the results on the Java Stack. " ; \
	"clean_sbes: removes SBES (useful to update SBES)." ; \
	"clean_evosuite: removes EvoSuite (useful to update EvoSuite)." ; \
	do echo "$$line" ; done

ITERATIONS:=$(shell seq 30)
TARGET_METHODS:=$(subst [],(),$(shell test -r $(CLASS)/target_methods.txt && cat $(CLASS)/target_methods.txt))

.PHONY: all
all: run

## This target runs all the iterations for all the methods for a given class.
## The class must be specified as a parameter (es. make CLASS=graphstream/edge).
##
.PHONY: run
run: $(foreach method,$(TARGET_METHODS),$(foreach iteration,$(ITERATIONS),$(CLASS)/$(method)/$(iteration)/log))

## This macro defines the output a specific execution of SBES.                                                                                                                                                                       
## The macro defines a pattern rule as follows:
## $(1) is the target method
## $(2) is the iteration number
##
define run_iteration
$(CLASS)/$(1)/$(2)/log: $(SBESJAR) $(EVOSUITEJAR) $(LIBS)/$(JARNAME) $(CLASS)/$(1)/initial_scenario/InitialScenario.java
	@echo "Running SBES on class $$(CLASS), method $(1), iteration $(2)"
	-test -d '$$(CLASS)/$(1)/$(2)' || mkdir -p '$$(CLASS)/$(1)/$(2)'
	-cd '$$(CLASS)/$(1)/$(2)' ; \
	$$(JAVA) -cp $$(SBESJAR):$$(SBESLIBS) sbes.SBES -classes=$$(LIBS)/$$(JARNAME) -method='$(1)' \
		 -test_scenario='../initial_scenario/InitialScenario.java' \
		 -junit=$$(JUNIT) -evosuite=$$(EVOSUITEJAR) -java=$$(JAVABINDIR) > log 2>&1
endef

## This is the "expasion" for the macro defined above.
##
$(foreach method,$(TARGET_METHODS),$(foreach iteration,$(ITERATIONS),$(eval $(call run_iteration,$(method),$(iteration)))))

#####################
#### SBES Build.
#####################
$(SBESROOT):
	cd $(TOOLS); \
	sh downloadTools.sh downloadFromSVN "sbes" "http://star.inf.usi.ch/repos/code/andrea/sbes"

.PHONY: sbes
sbes: $(SBESJAR)
$(SBESJAR): $(SBESROOT)
	cd $(SBESROOT) ; \
	$(ANT) ; \
	$(JAR) cf sbes.jar -C bin .

#####################
#### EvoSuite Build.
#####################
$(EVOSUITEROOT):
	cd $(TOOLS); \
	sh downloadTools.sh downloadFromMercurial "evosuite" $(EVOSUITEREPO)

.PHONY: evosuite
evosuite: $(EVOSUITEJAR)
$(EVOSUITEJAR): $(EVOSUITEROOT)
	cd $(EVOSUITEROOT) ; \
	$(MAVEN) package


#####################
#### Clean targets.
#####################
.PHONY: clean
clean:
	$(foreach method,$(TARGET_METHODS),$(shell find $(CLASS)/'$(method)'/* -maxdepth 0 -type d ! -name "initial_scenario" | xargs rm -rf)) 

.PHONY: clean_sbes
clean_sbes:
	rm -rf $(SBESROOT)

.PHONY: clean_evosuite
clean_evosuite:
	rm -rf $(EVOSUITEROOT)



