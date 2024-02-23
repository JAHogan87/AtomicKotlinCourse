// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  /* Can be combined:
  println(int+double)
  println(string+character)
  println(string+int)
  println(string+double)*/


  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  /* Can't be combined:
  println(int+string)
  println(int+boolean)
  println(int+character)
  */
}