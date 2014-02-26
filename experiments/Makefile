ROOT=../../../../
include $(ROOT)/common.mk
include conf.mk

.SILENT:

.PHONY: help
help:
	@for line in \
	"Main targets to run the experiments:" \
	"all: runs all the experiments"; \
	do echo "$$line" ; done

ITERATIONS:=$(shell seq 30)
RUN_ITERATIONS:=$(ITERATIONS:%=run_%)

.PHONY: all
all: $(RUN_ITERATIONS)

run_%:
	@echo "Running SBES on method $(METHODNAME), iteration $*"
	-test -d $@ || mkdir $@
	-cd $@ ; \
	$(JAVA) -cp $(SBESBIN):$(SBESLIBS) sbes.SBES \
	--classes=$(LIBDIR)/$(JARNAME) \
	--method=$(METHODNAME) \
	--search_budget=$(SEARCH_BUDGET) \
	--test_search_budget=$(TEST_SEARCH_BUDGET) \
	--junit=$(JUNIT) \
	--evosuite=$(EVOSUITE) \
	--java=$(JAVABINDIR) > $@.log 2>&1

clean:
	rm -rf run_* org.*