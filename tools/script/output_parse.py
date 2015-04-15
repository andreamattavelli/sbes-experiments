import csv
import sys
import os.path

for output in sys.argv[1:]:
    if not os.path.exists(output):
        continue
    
    reader = csv.reader(open(output, "rb"))
    sysnthesisCols = []
    rows = list(reader)

    i = 0
    for col in rows[0]:
        if col.startswith("SYNTHESIS"):          
            sysnthesisCols.append(i)
        i = i + 1
    max = 0
    for synt in sysnthesisCols:
        syntTime = int(rows[1][synt])
        if syntTime > max:
            max = syntTime
    if max != 0:
        print(output + ";" + str(max//1000))
