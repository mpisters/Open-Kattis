string = input()
text = list(string)
newList = []
i = 0
while i < len(text):
    currChar = text[i]
    if currChar == "<":
        if i != 0:
            newList.pop(-1)
        else:
            pass
    else:
        newList.append(currChar)
    i+=1
newString = ''.join(newList)
print(newString)
