n = int(input())
decimalArray = list(map(int,input().split()))

ones = decimalArray.count(1)
zeros = abs(n - ones)

for i in range(zeros):
  print(0, end = "")
for i in range(ones):
  print(1, end = "")
print()  
  