n = int(input())
m = int(input())

differnce = 6
primes = []
flag = 0
primeSets = []
demo = []

for i in range(n, m+1, 1):
  for j in range(2, int(i ** 0.5) + 1, 1):
    if i % j == 0:
      flag = 1
      break
  if flag == 0:
    primes.append(i)
  flag = 0
  
for i in range(len(primes)):
  if primes[i]+6 in primes:
    demo.append(primes[i])
    demo.append(primes[i] + 6)
    primeSets.append(list(demo))
    demo.clear()
if primeSets:   
	print(len(primeSets))    
else:
  print("No Prime Pairs")
