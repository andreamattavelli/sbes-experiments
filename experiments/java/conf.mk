JARNAME=stack.jar

$(LIBS)/$(JARNAME):
	rm -f $@
	cd $(LIBS)/java/src; \
	$(JAVAC) stack/util/Stack.java; \
	$(JAR) cf $(JARNAME) stack/*; \
	mv $(JARNAME) ../..
