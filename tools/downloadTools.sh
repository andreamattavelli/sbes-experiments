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

downloadFromMercurial() {
    tool=$1
    if [ -d $tool ]; then
	echo "$tool already exists in tools directory. Removing $tool..."
	rm -rf $tool
    fi
   	echo "Downloading $tool..."
   	hg clone $2 $1
}

downloadFromGit() {
    tool=$1
    if [ -d $tool ]; then
	echo "$tool already exists in tools directory. Removing $tool..."
	rm -rf $tool
    fi
   	echo "Downloading $tool..."
   	git clone $2 $1
}

$@
