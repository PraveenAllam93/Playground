n = int(input())

j = n - 1
bobVal = list(map(int,input().split()))
bobVal.sort(reverse = True)
result = []
result2 = []
mid = n // 2
if n > 1:
  for i in range(0,n-1,2):
    result.append(bobVal[i])
    result2.append(bobVal[i+1])
    if n % 2 != 0 and i == mid:
      result.append(bobVal[n-1])
  for i in range(len(result)-1,-1,-1):
    result2.append(result[i])      
else:
  result2.append(bobVal[0])

for i in result2:
  print(i, end = " ")