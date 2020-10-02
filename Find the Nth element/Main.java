n = int(input())
arr = list(map(int,input().split()))
i = int(input())
if i < n:
	print(arr[i-1])
else:
  	print("No node found")