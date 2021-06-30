inputList = []

for n in range(4):
  inputArr = input()
  tmpList = list(map(int, inputArr.strip().split(' ')))
  inputList.append(tmpList)
print(inputList)

result = 0

for x in range(101):
  if (x == 0):
    continue
  for y in range(101):
    if (y == 0):
      continue
    for z in range(4):
      if (x >= inputList[z][0] and x < inputList[z][2]):
        if (y >= inputList[z][1] and y < inputList[z][3]):
          result += 1
          break 
print(result)