document = list(map(str,input().split()))
date = []
demo = []
for i in document:
  if "-" in i:
    demo = list(i.split("-"))
    if demo[2][-1] == ".":
      demo[2] = demo[2][0:-1]
    date.append(demo[2])
print(len(set(date)))    
    
