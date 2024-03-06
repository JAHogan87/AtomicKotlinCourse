// LoopingAndRanges/Task2.kt
package loopingAndRangesExercise2

fun factorial(n: Int): Long {
  var result = 1L
  for (i in 1..n) {
    result *= i
  }
  return result
}

fun sumOfFactorials(n: Int): Long
{
  var result2 = 1L
  var p = n-(n-1)
  for(i in 1..n-1)
  {
    p++
    result2 +=factorial(p)

  }

  return result2


}

fun main() {
  println(sumOfFactorials(10))  // 4037913
}