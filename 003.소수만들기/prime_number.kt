class Solution {
  fun solution(nums: IntArray): Int {
    var answer = 0
    var firstNum: Int = 0
    var secondNum: Int = 0
    var thirdNum: Int = 0
    
    for (i in nums.indices) {
      firstNum = nums[i]
      for (j in i+1 until nums.size) {
        secondNum = nums[j]
        for (k in j+1 until nums.size) {
          thirdNum = nums[k]
          // check prime number
          if (isPrimeNumber(firstNum+secondNum+thirdNum)) {
            answer += 1
          }
        } // end for-k
      } // end for-j
    } // end for-i
    
    return answer
  }
  private fun isPrimeNumber(inputNum: Int): Boolean {
    if (inputNum <= 1) {
      return false
    }
    for (i in 2 until inputNum) {
      if (inputNum % i == 0) {
        return false
      }
    }
    return true
  }
}

fun main() {
  var sol: Solution = Solution()
  var input = arrayListOf<Int>(1, 2, 3, 4)
  println(sol.solution(input.toIntArray()))
}