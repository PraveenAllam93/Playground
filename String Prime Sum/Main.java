def primeSum(primeString):
  primes = []
  primeFlag = 0
  for i in range(2,primeString):
    primeFlag = 0
    for j in range(2,int(i ** 0.5)+1,1):
      if i != j:
        if i % j == 0:
          primeFlag = 1
          break
    if primeFlag == 0:
      primes.append(i)
      
  return sum(primes)



primeString = input()
flag = 0
negative = 0
for i in range(len(primeString)):
  if i == 0 and primeString[0] == "-":
    negative = 1
  else:
    if primeString[i] < '0' or primeString[i] > '9':
      flag = 1
      break
if flag == 1:
  print(0)
else:
  if negative == 1:
    primeString = -1 * int(primeString[1: ])
  else:
    primeString = int(primeString)
  primeSumVal = primeSum(primeString)
  print(primeSumVal)
    
    
  