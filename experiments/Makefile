ROOT=$(realpath ..)
include $(ROOT)/common.mk
include $(firstword $(subst /, ,$(CLASS)))/conf.mk

#.SILENT:

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

.PHONY: run
run: $(foreach method,$(TARGET_METHODS),$(foreach iteration,$(ITERATIONS),$(CLASS)/$(method)/$(iteration)/log))

define run_iteration
$(CLASS)/$(1)/$(2)/log:
	@echo "Running SBES on class $$(CLASS), method $(1), iteration $(2)"
	-test -d '$$(CLASS)/$(1)/$(2)' || mkdir -p '$$(CLASS)/$(1)/$(2)'	
	cd '$$(CLASS)/$(1)/$(2)' ; \
	$$(JAVA) -cp $$(SBESBIN):$$(SBESLIBS) sbes.SBES -classes=$$(LIBS)/$$(JARNAME) -method='$(1)' -junit=$$(JUNIT) -evosuite=$$(EVOSUITE) -java=$$(JAVABINDIR) > log 2>&1
endef

$(foreach method,$(TARGET_METHODS),$(foreach iteration,$(ITERATIONS),$(eval $(call run_iteration,$(method),$(iteration)))))

## TO UPDATE!
clean:
	rm -rf run_* org.*
