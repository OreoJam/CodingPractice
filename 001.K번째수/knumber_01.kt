import java.util.Arrays

class Solution {
  fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = IntArray(commands.size)
    var r_index: Int = 0
    
    var temp_array = IntArray(100)
    var index: Int = 0
    for (item in commands) {
      // print commands
      //println("item: ${item[0]} ${item[1]} ${item[2]}")
      index = 0
      temp_array = IntArray(100) { i -> 999 }
      for (i in array.indices) {
        if (i >= item[0] - 1 && i <= item[1] - 1) {
          temp_array[index] = array[i]
          index += 1
        }
      }
      temp_array.sort()
      //println(Arrays.toString(temp_array))
      answer.set(r_index, temp_array[item[2] - 1])
      r_index += 1
    }
    return answer
  }

}

fun main() {
  var sol = Solution()
  var array = intArrayOf(1, 5, 2, 6, 3, 7, 4)
  var commands = arrayOf(intArrayOf(2,5,3), intArrayOf(4,4,1), intArrayOf(1,7,3))
  
  val result = sol.solution(array, commands)
}