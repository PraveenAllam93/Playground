lowerLimit = int(input())
upperLimit = int(input())

countArray = []
checkList = []
flag = ""
checkLength = 0

for i in range(lowerLimit, upperLimit+1, 1):
  flag = str(i)
  checkLength = len(flag)
  checkList = list(set(flag))
  if len(checkList) == checkLength:
    countArray.append(i)

if countArray:    
	print(len(countArray)) 
else:
  	print("No Unique Number")
  