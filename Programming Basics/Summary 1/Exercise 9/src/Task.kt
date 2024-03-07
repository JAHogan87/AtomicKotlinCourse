// Summary1/Task9.kt
package summaryIExercise9

fun printTriangle(n: Int) {
  var i = 1
  for (i in 1..n) {
    var stop = (n * 2 - 1) / 2
    var count = 1

    for (count in i..stop) {
      print(' ')
    }
for(i in 1..(i+i-1) )
{
  print('#')
}

    for (count in i..stop) {
      if(count==stop)
        print("\n")

    }

  }
  i++
}

fun main() {
  printTriangle(4)
}
/* Output:
   #
  ###
 #####
#######
*/