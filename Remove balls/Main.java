n = int(input())
removings = [0,1,1,2]
if n > 3:
    for i in range(4,n+1,1):
        removings.append((removings[i-1] + removings[i-3])  % 1000000007)
print(removings[n])    