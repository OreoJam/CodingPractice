
def solution(array, commands):
  answer = []

  answer = list(map(
    lambda command: sorted(array[command[0]-1:command[1]])[command[2]-1],
    commands
  ))
    
  return answer

def main():
  print("CodingPractice 001")
  print("Expected: [5, 6, 3]")

  array = [1, 5, 2, 6, 3, 7, 4]
  commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
  result = solution(array, commands)

  print("Result: " + str(result))

if __name__ == '__main__':
    main()