JARNAME=stack.jar
SOURCEDIR=$(LIBS)/java/src
SOURCES=`find -L $(SOURCEDIR) -name \*.java`

$(LIBS)/$(JARNAME):
	rm -f $@
	cd $(SOURCEDIR); \
	$(JAVAC7) -g $(SOURCES); \
	$(JAR7) cf $(JARNAME) stack/*; \
	mv $(JARNAME) ../..
