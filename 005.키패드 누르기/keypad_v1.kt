import kotlin.math.abs

class Solution {
  fun solution(numbers: IntArray, hand: String): String {
    var answer = ""
    var strBuilder = StringBuilder()
    
    var arr = Array(4, {IntArray(3)} )
    arr[0][0] = 1
    arr[0][1] = 2
    arr[0][2] = 3
    arr[1][0] = 4
    arr[1][1] = 5
    arr[1][2] = 6
    arr[2][0] = 7
    arr[2][1] = 8
    arr[2][2] = 9
    arr[3][0] = -1  // *
    arr[3][1] = 0
    arr[3][2] = -2  // #
  
    var leftXPos = 3
    var leftYPos = 0
    var rightXPos = 3
    var rightYPos = 2
    var usedHand = ""
    var targetXPos = 0
    var targetYPos = 0
    var distanceLTarget = 0
    var distanceRTarget = 0
    
    for (item in numbers) {
      // Find target location
      for (i: Int in 0..3) {
        for (j: Int in 0..2) {
          if (arr[i][j] == item) {
            targetXPos = i
            targetYPos = j
          }
        }
      }
      
      if (item == 1 || item == 4 || item == 7) {
        usedHand = "L"
      }
      else if (item == 3 || item == 6 || item == 9) {
        usedHand = "R"
      }
      else {
        // Calculate distance
        distanceLTarget = abs(targetXPos - leftXPos) + abs(targetYPos - leftYPos)
        distanceRTarget = abs(targetXPos - rightXPos) + abs(targetYPos - rightYPos)
        if (distanceLTarget < distanceRTarget) {
          usedHand = "L"
        }
        else if (distanceLTarget > distanceRTarget) {
          usedHand = "R"
        }
        else {
          if (hand == "right") {
            usedHand = "R"
          }
          else {
            usedHand = "L"
          }
        }
      }
      
      if (usedHand == "R") {
        rightXPos = targetXPos
        rightYPos = targetYPos
      }
      else {
        leftXPos = targetXPos
        leftYPos = targetYPos
      }
      
      // write result
      strBuilder.append(usedHand)
      
    } // End of For (main)
    
    return strBuilder.toString()
  }
}

fun main() {
  val inputArr = intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5)
  val hand = "right"
  
  var sol: Solution = Solution()
  println(sol.solution(inputArr, hand))
  
}