s = input()
amount = 10
betAmount = 1
n = len(s)
flag = 0
for i in range(0,len(s)):
  if betAmount > amount:
    flag = 1
    break
  if s[i] == 'W':
    amount += betAmount
    if betAmount != 1:
      betAmount = betAmount // 2
  elif s[i] == 'L':
    amount -= betAmount
    betAmount *= 2
    
if flag == 0:
  print(amount)
else:
  print(-1)
    
    
    