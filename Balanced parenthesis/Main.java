string = input()
l=[]
flag=0
j=0
for i in range(len(string)):
    if string[i]=='(' or string[i]=='{' or string[i]=='[':
        l.append(string[i])
        j+=1
    else:
        if len(l)==0 and (string[i]==')' or string[i]==']' or string[i]=='}'):
            print("Not Balanced")
            flag=1
            break
        elif (string[i]==')' and l[j-1]=='(') or (string[i]==']' and l[j-1]=='[') or (string[i]=='}' and l[j-1]=='{'):
            l.pop()
            j-=1
        else:
            flag=1
            print("Not Balanced")
            break
if len(l)==0 and flag==0:
    print("Balanced")
elif flag==0:
    print("Not Balanced")