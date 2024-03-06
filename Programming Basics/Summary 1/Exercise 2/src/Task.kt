// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String
{
  var length = s.length
  var output = ""
  for(i in 0..length-1 step 2)
  {
    output += s[i]
  }

  return output
}

fun main()
{
  println(other("cement"))
}
/* Output:
cmn
*/