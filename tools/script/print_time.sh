#!/bin/bash

graphstream=(edge multinode node path vector2 vector3)

for dir in ${graphstream[@]}
do
	python ../tools/script/output_parse.py graphstream/$dir/*/*/*/output.csv > max_synthesis_time_$dir.csv
	python ../tools/script/output_parse_ct.py graphstream/$dir/*/*/*/output.csv > max_counterexample_time_$dir.csv
done

python ../tools/script/output_parse.py java/stack/*/*/*/output.csv > max_synthesis_time_stack.csv
python ../tools/script/output_parse_ct.py java/stack/*/*/*/output.csv > max_counterexample_time_stack.csv

exit 0