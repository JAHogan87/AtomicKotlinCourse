// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String
{
  var alphabet = ""
  for(i in 'a'..'z')
  {
    alphabet += i
  }
  return alphabet
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}