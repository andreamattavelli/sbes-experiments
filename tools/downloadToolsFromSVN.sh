#/bin/bash
#
# This script automatically downloads from the star SVN repository 
# all the tools needed to run the experiments.
#
# contact: Alessandra Gorla <alessandra.gorla@usi.ch>

downloadFromSVN() {
    if [ -d $1 ]; then
	echo "$1 already exists in tools directory."
    else
	echo "$1 does not exist in tools directory. Downloading it now from SVN"
	svn co https://star.inf.usi.ch/repos/code/HippoHeal-Experiments-ICSE13/trunk/tools/$1 $1
    fi
}

downloadRandoop() {
    if [ -d "randoop" ]; then
        echo "Randoop already exists."
    else
        echo "Downloading randoop jar."
        mkdir randoop
        cd randoop
        if [ "$(uname)" == 'Darwin' ]
        then curl -O http://randoop.googlecode.com/files/randoop.1.3.3.jar
        else wget http://randoop.googlecode.com/files/randoop.1.3.3.jar
        fi  
        cd ..
    fi
}

downloadJUnit() {
    if [ -d "junit" ]; then
		echo "JUnit already exists."
    else
		echo "Downloading JUnit jar."
		mkdir junit
		cd junit
		if [ "$(uname)" == 'Darwin' ]
			then curl -L -O https://github.com/downloads/junit-team/junit/junit-4.10.jar
			else wget --no-check-certificate https://github.com/downloads/junit-team/junit/junit-4.10.jar
		fi
		cd ..
    fi
}

downloadCobertura() {
    if [ -d "cobertura-1.9.4.1" ]; then
        echo "Cobertura already exists."
    else
        echo "Downloading Cobertura."
        if [ "$(uname)" == 'Darwin' ]
        then curl -o cobertura-1.9.4.1-bin.tar.bz2  -L -O http://sourceforge.net/projects/cobertura/files/cobertura/1.9.4.1/cobertura-1.9.4.1-bin.tar.bz2/download
        else wget http://downloads.sourceforge.net/project/cobertura/cobertura/1.9.4.1/cobertura-1.9.4.1-bin.tar.bz2
        fi   
        tar -jxvf cobertura-1.9.4.1-bin.tar.bz2
    fi
}

downloadESoraSVN() {
    if [ -d "ESOra" ]; then
	echo "There is already a checkout copy of ESOra in tool directory. Updating it"
	svn update ESOra
	rm -rf ESOra/bin
	rm -f ESOra/*.jar
    else
	echo "ESOra does not exist in tools directory. Downloading it now from SVN."
	svn co https://star.inf.usi.ch/repos/code/alberto/ESOracles ESOra
    fi
}

downloadOracleRemoverSVN() {
    if [ -d "OracleRemover" ]; then
    echo "There is already a checkout copy of OracleRemover in tool directory. Updating it"
    svn update OracleRemover
    rm -rf OracleRemover/bin
    else
    echo "OracleRemover does not exist in tools directory. Downloading it now from SVN."
    svn co https://star.inf.usi.ch/repos/code/alberto/ESOracles-OracleRemover OracleRemover
    fi
}

#downloadFromSVN "SootTracer"
downloadFromSVN "major"
downloadRandoop
downloadJUnit
downloadCobertura
downloadESoraSVN
downloadOracleRemoverSVN