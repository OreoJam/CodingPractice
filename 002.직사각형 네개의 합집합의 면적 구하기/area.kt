import kotlin.system.exitProcess
//import java.util.Arrays

fun main() {
  var inputArr = Array(4) {Array(4) {0} }
  //println(inputArr.javaClass.kotlin.simpleName)
  
  // Get Input
  for(i: Int in 0..3) {
    var input = readLine() ?: exitProcess(0)
    //println(input.javaClass.kotlin.simpleName)
    
    var splitArr = input.split(" ").map { it.toInt() }
    //println(splitArr.javaClass.kotlin.simpleName)
    
    inputArr[i] = splitArr.toTypedArray()
    //println(splitArr.toTypedArray().javaClass.kotlin.simpleName)
  }
  
  /* Print Input
  for (item in inputArr) {
    println(Arrays.toString(item))
  }
   */
  var result: Int = 0
  for (x in 1..100) {
    for (y in 1..100) {
      for (z in 0..3) {
        if (x >= inputArr[z][0] && x < inputArr[z][2] &&
              y >= inputArr[z][1] && y < inputArr[z][3]) {
          result += 1
          break
        }
      }
    }
  }
  
  println(result)
}
