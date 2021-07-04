
def dfs(s_idx, c_idx, iList, vList):
  #print("c_idx: " + str(c_idx))
  #print(vList)
  # 다음갈곳
  value = iList[c_idx]

  if (vList[value] == False):
    # 방문표시
    vList[c_idx] = True
    # 방문안했으면 GOGO
    result = dfs(s_idx, value, iList, vList)
    return result
  else:
    if (value == s_idx):
      return True
    else:
      return False

num = int(input())
inputList = [0]

for n in range(1, num+1):
  inputList.append(int(input()))

resultList = []
resultCount = 0

for i in range(1, num+1):
  xNum = i
  yNum = inputList[i]
  
  visitedList = [False] * (num+1)
  #print("---------------------")
  result = dfs(i, i, inputList, visitedList)
  #print(result)

  if result:
    resultCount += 1
    resultList.append(i)

resultList.sort()

print(resultCount)
for item in resultList:
  print(item)