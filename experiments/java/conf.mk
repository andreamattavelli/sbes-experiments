JARNAME=stack.jar
SOURCEDIR=$(LIBS)/java/src
SOURCES=`find -L $(SOURCEDIR) -name \*.java`

$(LIBS)/$(JARNAME):
	rm -f $@
	cd $(SOURCEDIR); \
	$(JAVAC) -g $(SOURCES); \
	$(JAR) cf $(JARNAME) stack/*; \
	mv $(JARNAME) ../..
