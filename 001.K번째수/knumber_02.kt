import java.util.Arrays

class Solution {
  fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = intArrayOf()
    answer = commands.map {
      command -> array.slice(IntRange(command[0]-1, command[1]-1)).sorted()[command[2]-1]
    }.toIntArray()
    
    return answer
  }
}

fun main() {
  println("CodingPractice 001")
  println("Expected: [5, 6, 3]")
  
  var sol = Solution()
  var array = intArrayOf(1, 5, 2, 6, 3, 7, 4)
  var commands = arrayOf(intArrayOf(2,5,3), intArrayOf(4,4,1), intArrayOf(1,7,3))
  
  val result = sol.solution(array, commands)
  println("Result: " + Arrays.toString(result))
}