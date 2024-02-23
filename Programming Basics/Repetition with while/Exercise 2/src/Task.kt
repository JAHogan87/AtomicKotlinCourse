// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int
{
  var count = 0
  var sum = 0

  while(count<number+1)
  {

     sum += count
    count++
  }
  return sum

}

fun main()
{
  println(sum(10))  // 55
}