// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long
{
  var i = 0
  var sum = 1L
  for(i in 1..n)
  {
   sum *= i
  }
  return sum
}

fun main() {
  println(factorial(10))  // 3628800
}