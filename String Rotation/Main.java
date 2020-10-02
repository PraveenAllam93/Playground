str1 = input()
str2 = input()
temp = str1 + str1
if temp.find(str2) == -1:
  print("No")
else:
  print("Yes")