n = int(input())
arr = list(map(int,input().split()))
k = int(input())
result = []
finalResult = []
for i in range(0,n,k):
  result.append(arr[i:i+k])
for i in range(len(result)):
  for j in range(len(result[i])-1,-1,-1):
    finalResult.append(result[i][j])
for i in finalResult:
  print(i,end = " ")
  
print()