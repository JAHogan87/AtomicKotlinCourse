// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int
{
  var count = 0
  var sum = 0
  while(count<=n)
  {
    if ((count % 2) == 0)
      sum += count
    count++
  }

    return sum

}

fun main() {
  println(sumOfEven(10))  // 30
}