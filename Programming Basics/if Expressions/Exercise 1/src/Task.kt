// IfExpressions/Task1.kt
package ifExpressionsExercise1

fun checkSign(number: Int): String
{
  return if (number>0)
    return "positive"
  else if (number<0)
    return "negative"
  else
    return "zero"
}


fun main() {
  println(checkSign(-19))  // negative
}