import kotlin.system.exitProcess

fun dfs(
  sIdx: Int,
  cIdx: Int,
  iArr: Array<Int>,
  vArr: Array<Boolean>
): Boolean {
  //println("sIdx: $sIdx, cIdx: $cIdx")
  val value: Int = iArr[cIdx]
  if (vArr[value] == false) {
    vArr[cIdx] = true
    val result: Boolean = dfs(sIdx, value, iArr, vArr)
    return result
  } else {
    return value == sIdx
  }
}

fun main() {
  val num: Int = readLine()?.toInt() ?: exitProcess(0)
  val inputArr = Array(num+1) {0}
  var visitedArr = Array(num+1) {false}
  var result: Boolean = false
  var resultCount: Int = 0
  var resultArr: ArrayList<Int> = ArrayList()
  
  for(i: Int in 1..num) {
    inputArr[i] = readLine()?.toInt() ?: exitProcess(0)
  }
  
  for(i: Int in 1..num) {
    //println("--------------------")
    visitedArr = Array(num+1) {false}
    result = dfs(i, i, inputArr, visitedArr)
    
    if (result) {
      resultCount++
      resultArr.add(i)
    }
  }
  
  println(resultCount)
  for(i: Int in resultArr.indices) {
    println(resultArr[i])
  }
  
}