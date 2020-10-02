t = int(input())
for _ in range(t):
  n = int(input())
  nBinary = bin(n)
  nBinary = nBinary[2:]
  oneCount = nBinary.count('1')
  print(oneCount)
  