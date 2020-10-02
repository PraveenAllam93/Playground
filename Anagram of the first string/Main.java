strInput1 = input()
strInput2 = input()

listStr1 = list(strInput1)
listStr2 = list(strInput2)

listStr1.sort()
listStr2.sort()

if listStr1 == listStr2:
  print("Anagram")
else:
  print("Not anagrams")