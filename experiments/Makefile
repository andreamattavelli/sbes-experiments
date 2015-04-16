ROOT=$(realpath ..)
include $(ROOT)/common.mk

PROJECT=guava
include $(PROJECT)/conf.mk

.SILENT:

.PHONY: help
help:
	@for line in \
	"Main targets to run the experiments:" \
	"all: runs all the classes in targets.txt." \
	"" \
	"Clean targets:" \
	"clean: do nothing. " \
	"veryclean: removes all the results from all the classes in targets.txt. " \
	"clean_sbes: removes SBES (useful to update SBES)." \
	"clean_evosuite: removes EvoSuite (useful to update EvoSuite)." ; \
	do echo "$$line" ; done

ITER=1
ITERATIONS:=$(shell seq $(ITER))
# TARGETS contains all target classes in targets.txt which belong to the given PROJECT
TARGETS=$(shell test -r targets.txt && cat targets.txt | grep $(PROJECT))

.PHONY: all
all: experiments

## This target runs all the iterations for all the methods for a given class.
class_methods = ${subst ],),${subst [,(,$(shell test -r $(class)/target_methods.txt && cat $(class)/target_methods.txt)}}
.PHONY: run
run: $(foreach class,$(TARGETS),$(foreach method,$(class_methods),$(foreach iteration,$(ITERATIONS),$(class)/$(method)/$(iteration)/log)))

define run_iteration
 $(1)/$(2)/$(3)/log: $(SBESJAR) $(EVOSUITEJAR) $(LIBS)/$(JARNAME) $(1)/$(2)/initial_scenario/InitialScenario.java
	@echo "Running SBES on class $(1), method $(2), iteration $(3)"
	-test -d '$(1)/$(2)/$(3)' || mkdir -p '$(1)/$(2)/$(3)'
	-cd '$(1)/$(2)/$(3)' ; \
	$$(JAVA) -cp $$(SBESJAR):$$(SBESLIBS) sbes.SBES \
		-classes=$$(LIBS)/$$(JARNAME) \
		-junit=$$(JUNIT) -evosuite=$$(EVOSUITEJAR) -java=$$(JAVABINDIR) \
		-synthesis_budget=$$(SYNTHESIS_BUDGET) -counterexample_budget=$$(COUNTEREXAMPLE_BUDGET) \
		-target_method='$(2)' \
		-test_scenario='../initial_scenario/InitialScenario.java' \
		-stopping_condition=ITERATIONS -stopping_condition_value=20 > log 2>&1
endef

## This is the "expansion" for the macro defined above.
$(foreach class,$(TARGETS),$(foreach method,$(class_methods),$(foreach iteration,$(ITERATIONS),$(eval $(call run_iteration,$(class),$(method),$(iteration))))))

## This target should be always invoked
## Runs all the classes in targets.txt
##
.PHONY: experiments
# PROJECTS contains all projects in target.txt
PROJECTS:=$(shell test -r targets.txt && sed 's/\/.*//g' targets.txt | uniq)
experiments:
	for PROJECT in $(PROJECTS); do \
		$(MAKE) run PROJECT=$$PROJECT; \
	done

## This target runs all the script to collect the data for the paper
##
.PHONY: data
data:
	bash $(TOOLS)/script/print_time.sh
	bash $(TOOLS)/script/print_es.sh

#####################
#### SBES Build.
#####################
$(SBESROOT): $(EVOSUITEJAR)
	cd $(TOOLS); \
	sh downloadTools.sh downloadFromSVN "sbes" "http://star.inf.usi.ch/repos/code/SBES/trunk/sbes/"

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
	echo ""

.PHONY: veryclean
veryclean:
	$(foreach class,$(TARGETS),$(foreach method,$(class_methods),$(shell find $(class)/'$(method)'/* -maxdepth 0 -type d ! -name "initial_scenario" | xargs rm -rf)))

.PHONY: clean_sbes
clean_sbes:
	rm -rf $(SBESROOT)

.PHONY: clean_evosuite
clean_evosuite:
	rm -rf $(EVOSUITEROOT)
