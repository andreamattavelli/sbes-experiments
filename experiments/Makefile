ROOT=..
include $(ROOT)/common.mk
#include conf.mk

#.SILENT:

.PHONY: help
help:
	@for line in \
	"Main targets to run the experiments:" \
	"all: runs all the experiments" ; \
	do echo "$$line" ; done

ITERATIONS:=$(shell seq 1)
RUN_ITERATIONS:=$(ITERATIONS:%=run_%)

CLASS:=graphstream/edge
TARGET_METHODS:=$(subst [],(),$(shell test -r $(CLASS)/target_methods.txt && cat $(CLASS)/target_methods.txt))

.PHONY: all
all: run

# run_%:
# 	@echo "Running SBES on method $(METHODNAME), iteration $*"
# 	-test -d $@ || mkdir $@
# 	-cd $@ ; \
# 	$(JAVA) -cp $(SBESBIN):$(SBESLIBS) sbes.SBES \
# 	--classes=$(LIBDIR)/$(JARNAME) \
# 	--method=$(METHODNAME) \
# 	--search_budget=$(SEARCH_BUDGET) \
# 	--test_search_budget=$(TEST_SEARCH_BUDGET) \
# 	--junit=$(JUNIT) \
# 	--evosuite=$(EVOSUITE) \
# 	--java=$(JAVABINDIR) > $@.log 2>&1

.PHONY: run
run: $(foreach method,$(TARGET_METHODS),$(foreach iteration,$(RUN_ITERATIONS),$(CLASS)/$(method)/$(iteration).log))

define run_iteration
$(CLASS)/$(1)/%.log:
	@echo "Running SBES on class $$(CLASS), method $(1), iteration $$*"
	-test -d '$$(CLASS)/$(1)' || mkdir '$$(CLASS)/$(1)'	
	cd '$$(CLASS)/$(1)' ; \
	$$(JAVA) -cp $$(SBESBIN):$$(SBESLIBS) sbes.SBES \
	--classes=$$(LIBDIR)/$$(JARNAME) \
	--method=$(1) \
	--search_budget=$$(SEARCH_BUDGET) \
	--test_search_budget=$$(TEST_SEARCH_BUDGET) \
	--junit=$$(JUNIT) \
	--evosuite=$$(EVOSUITE) \
	--java=$$(JAVABINDIR) > $$*.log 2>&1
endef

$(foreach method,$(TARGET_METHODS),$(eval $(call run_iteration,$(method))))

## TO UPDATE!
clean:
	rm -rf run_* org.*
