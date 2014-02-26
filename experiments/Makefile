ROOT=$(realpath ..)
include $(ROOT)/common.mk
include $(firstword $(subst /, ,$(CLASS)))/conf.mk

.SILENT:

.PHONY: help
help:
	@for line in \
	"Main targets to run the experiments:" \
	"all: runs all the experiments" ; \
	do echo "$$line" ; done

ITERATIONS:=$(shell seq 1)
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
$(CLASS)/$(1)/$(2)/log: $(SBESJAR) $(LIBS)/$(JARNAME)
	@echo "Running SBES on class $$(CLASS), method $(1), iteration $(2)"
	-test -d '$$(CLASS)/$(1)/$(2)' || mkdir -p '$$(CLASS)/$(1)/$(2)'	
	cd '$$(CLASS)/$(1)/$(2)' ; \
	$$(JAVA) -cp $$(SBESJAR):$$(SBESLIBS) sbes.SBES -classes=$$(LIBS)/$$(JARNAME) -method='$(1)' -junit=$$(JUNIT) -evosuite=$$(EVOSUITE) -java=$$(JAVABINDIR) > log 2>&1
endef

## This is the "expasion" for the macro defined above.
##
$(foreach method,$(TARGET_METHODS),$(foreach iteration,$(ITERATIONS),$(eval $(call run_iteration,$(method),$(iteration)))))

#####################
#### SBES Build.
####################
$(SBESROOT)/sbes.jar:
	cd $(SBESROOT); \
	$(ANT); \
	$(JAR) cf sbes.jar -C bin .

## TO UPDATE!
.PHONY: clean
clean:
	rm -rf run_* org.*
