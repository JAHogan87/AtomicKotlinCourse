// LoopingAndRanges/Task3.kt
package loopingAndRangesExercise3

fun sumOfEven(n: Int): Int {
  var sum = 0
  for(i in 1..n)
  {
    if(i%2==0)
      sum += i


  }
  return sum
}

fun main() {
  println(sumOfEven(10))  // 30
}