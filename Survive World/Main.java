def remaining(n):
  if n == 0:
    return -1
  if n == 1:
    return 0
  elif n % 2 == 0:
    return 2 * remaining(n//2)
  else:
    return 2 * remaining((n-1)//2) + 2
    

n = int(input())
print(remaining(n)) 
