def LongIncSubArr(arr, n):
    m = []
    demo = []
    flag = 0
    for i in range(0,n-1):
      if arr[i] <= arr[i+1]:
        demo.append(arr[i])
        flag = 0
      else:
        demo.append(arr[i])
        m.append(list(demo))
        flag = 1
        demo.clear()
    if flag == 0:
        if arr[n-1] >= arr[n-2]:
            demo.append(arr[n-1])
            m.append(list(demo))
        else:
            m.append(list(demo))
            demo.clear()
            demo.append(arr[n-1])
            m.append(list(demo))
    return m

  
t =  int(input())
for _ in range(t):
  n = int(input())
  arr = list(map(int,input().split()))
  l = LongIncSubArr(arr, n)
  lengths = []
  for i in range(len(l)):
    lengths.append(len(l[i]))
  maxLength = max(lengths)
  for i in range(len(l)):
    if len(l[i]) == maxLength:
      maxLengthIndex = i
      break
  for i in l[maxLengthIndex]:
    print(i,end=" ")
  print()  