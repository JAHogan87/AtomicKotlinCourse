// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(a: Int, b: Int) = a + b


fun g(g1: String, g2: String) = g1 + g2

fun h() = println("h()")

fun main()
{
  val fVal: Int = f(1, 2)
  val gVal: String = g("a", "bc")
  val hVal: Unit = h()
  println("Int")
  println("String")
  println("Unit")


}