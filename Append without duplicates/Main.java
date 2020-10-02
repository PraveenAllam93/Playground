flag = 0
rollNumbers = []
noDups = []
while flag == 0:
  rollNumbers.append(int(input()))
  if rollNumbers[-1] < 0:
    flag = 1
rollNumbers = rollNumbers[0:-1]
for i in rollNumbers:
  if i not in noDups:
    noDups.append(i)
    
if noDups:
  for i in noDups:
    print(i)
else:
  print("List is empty")

    
  