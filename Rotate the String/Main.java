inputString = input()
position = int(input())
direction = input()
position = position % len(inputString)
result = ""
if direction == 'L':
  result += inputString[position : ]
  result += inputString[0 : position]
  print(result)
else:
  result += inputString[ len(inputString) - position : ]
  result += inputString[0 : len(inputString) - position ]
  print(result)