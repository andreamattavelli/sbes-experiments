ROOT=$(realpath ..)
include $(ROOT)/common.mk

CLASS=default/foo
include $(firstword $(subst /, ,$(CLASS)))/conf.mk

.SILENT:

.PHONY: help
help:
	@for line in \
	"Main targets to run the experiments:" \
	"all: runs all the experiments on the case study specified in the CLASS parameter." \
	"     For example, make CLASS=java/stack will run the experiments on the Java Stack." \
	"fse2014: runs the experimental evaluation we conducted for FSE 2014." \
	"" \
	"Clean targets:" \
	"clean: clean all the experiment for the class specified in the CLASS parameter." \
	"       For example, make clean CLASS=java/stack will clean the results on the Java Stack."; \
	do echo "$$line" ; done

ITERATIONS:=$(shell seq 30)
TARGET_METHODS:=${subst ],),${subst [,(,$(shell test -r $(CLASS)/target_methods.txt && cat $(CLASS)/target_methods.txt)}}

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
	$$(JAVA) -cp $$(SBESJAR):$$(SBESLIBS) sbes.SBES -synthesis_budget=$$(SYNTHESIS_BUDGET) -counterexample_budget=$$(COUNTEREXAMPLE_BUDGET) -classes=$$(LIBS)/$$(JARNAME) -method='$(1)' \
		 -test_scenario='../initial_scenario/InitialScenario.java' \
		 -junit=$$(JUNIT) -evosuite=$$(EVOSUITEJAR) -java=$$(JAVABINDIR) > log 2>&1
endef

## This is the "expasion" for the macro defined above.
##
$(foreach method,$(TARGET_METHODS),$(foreach iteration,$(ITERATIONS),$(eval $(call run_iteration,$(method),$(iteration)))))

.PHONY: fse2014
fse2014: 
	while read TARGET; do \
		$(MAKE) CLASS=$$TARGET; \
	done < targets.txt
	$(MAKE) data

.PHONY: data
data: 
	$(shell $(TOOLS)/script/print_time.sh)
	$(shell $(TOOLS)/script/print_es.sh)

#####################
#### Clean targets.
#####################
.PHONY: clean
clean:
	$(foreach method,$(TARGET_METHODS),$(shell find $(CLASS)/'$(method)'/* -maxdepth 0 -type d ! -name "initial_scenario" | xargs rm -rf)) 

.PHONY: veryclean
veryclean:
	while read TARGET; do \
		$(MAKE) clean CLASS=$$TARGET; \
	done < targets.txt

