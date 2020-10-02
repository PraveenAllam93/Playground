stairs = [1,2]
n = int(input())
for i in range(2,n+1,1):
  stairs.append(stairs[i-1] + stairs[i-2])
  
print(stairs[n-1])  