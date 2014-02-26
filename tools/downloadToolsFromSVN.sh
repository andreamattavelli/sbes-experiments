#!/bin/bash
#
# This script automatically downloads from the STAR SVN repository 
# all the tools needed to run the experiments.

downloadFromSVN() {
    tool=$1
    if [ -d $tool ]; then
	   echo "$tool already exists in tools directory. Removing $tool..."
       rm -rf $tool
    fi
	echo "Downloading $tool..."
	svn export $2 $tool
}

downloadFromSVN "sbes" "http://star.inf.usi.ch/repos/code/andrea/sbes"
