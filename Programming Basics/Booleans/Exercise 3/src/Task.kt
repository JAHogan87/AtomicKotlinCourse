// Booleans/Task3.kt
package booleansExercise3

fun and(b1: Boolean, b2: Boolean): Boolean =
  if((b1==true)&&(b2==true))
    true
else
    false

fun or(b1: Boolean, b2: Boolean): Boolean =
  if(b1==true || b2 ==true)
    true
else
  false


fun main() {
  println(and(true, true)) // true
  println(or(true, false)) // true
}