// LoopingAndRanges/Task4.kt
package loopingAndRangesExercise4

fun showHalfTriangle(n: Int)
{
  var i = 0
  var l = 1
  for(i in 0..n)
  {
   repeat(i)
   {
     print("#")
   }

    print("\n")
  }
  }


fun main() {
  showHalfTriangle(4)
}
/* Output:
#
##
###
####
*/