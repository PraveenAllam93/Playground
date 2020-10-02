from collections import OrderedDict

def countFreq(students):
  freqDict = {}
  for i in students:
    freqDict[i] = students.count(i)
  return freqDict

n = int(input())
students = []
for i in range(0,n):
  students.append(input())
cf = countFreq(students)
orderedCf = sorted(cf.items())
for i in orderedCf:
  print(i[0],i[1],end = " ")
  print()
  
  
