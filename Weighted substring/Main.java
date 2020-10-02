alphabets = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','R','T','U','V','W','X','Y','Z']
n = int(input())
weights = [1]
for i in range(1,26,1):
  weights.append(weights[i-1] + (i+1) * weights[i-1])
maxTerm = 0
if n in weights:
  ind = weights.index(n)
  print(alphabets[ind])
else:  
  for i in range(len(weights)):
    if n < weights[i]:
      maxTerm = i 
      break
  weights = weights[ :maxTerm]
  result = ""
  while n  > 0:
    if n >= weights[maxTerm - 1]:
      result += alphabets[maxTerm - 1]
      n -= weights[maxTerm - 1]
    else:
      maxTerm -= 1
  result = list(result)
  result.sort()
  output = ""
  for i in result:
    output += i
  print(output)