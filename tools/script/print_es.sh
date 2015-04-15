#!/bin/bash

graphstream=`find graphstream -maxdepth 4 -mindepth 4 -type f \( \( ! -ipath '*svn*' \) -a \( -iname "log" \) \) | sort`
java=`find java -maxdepth 4 -mindepth 4 -type f \( \( ! -ipath '*svn*' \) -a \( -iname "log" \) \) | sort`
guava=`find guava -maxdepth 4 -mindepth 4 -type f \( \( ! -ipath '*svn*' \) -a \( -iname "log" \) \) | sort`

rm -rf graphstream_es.txt
rm -rf java_es.txt
rm -rf guava_es.txt

echo "Processing GraphStream.."
for gs in $graphstream; do
	echo "========== $gs" >> graphstream_es.txt

	# get length of the log file
	length=`wc -l < $gs`
	# get initial position of equivalent sequences print
	position=`grep -n "Equivalent sequences synthesized" $gs | cut -d ':' -f1`

	if [ -z "$position" ]; then
		echo "No equivalent sequence found" >> graphstream_es.txt
	else
		tail_index=`expr $length - $position`
		head_index=`expr $tail_index - 4`

		tail -n$tail_index $gs | head -n$head_index >> graphstream_es.txt

		echo "" >> graphstream_es.txt
	fi
done

echo "Processing java.Stack.."
for jv in $java; do
	echo "========== $jv" >> java_es.txt

	# get length of the log file
	length=`wc -l < $jv`
	# get initial position of equivalent sequences print
	position=`grep -n "Equivalent sequences synthesized" $jv | cut -d ':' -f1`

	if [ -z "$position" ]; then
		echo "No equivalent sequence found"  >> java_es.txt
	else 
		tail_index=`expr $length - $position`
		head_index=`expr $tail_index - 4`

		tail -n$tail_index $jv | head -n$head_index  >> java_es.txt

		echo ""  >> java_es.txt
	fi
done

echo "Processing Google Guava.."
for gv in $guava; do
	echo "========== $gv" >> guava_es.txt

	# get length of the log file
	length=`wc -l < $gv`
	# get initial position of equivalent sequences print
	position=`grep -n "Equivalent sequences synthesized" $gv | cut -d ':' -f1`

	if [ -z "$position" ]; then
		echo "No equivalent sequence found"  >> guava_es.txt
	else 
		tail_index=`expr $length - $position`
		head_index=`expr $tail_index - 4`

		tail -n$tail_index $gv | head -n$head_index  >> guava_es.txt

		echo ""  >> guava_es.txt
	fi
done


echo "Done!"