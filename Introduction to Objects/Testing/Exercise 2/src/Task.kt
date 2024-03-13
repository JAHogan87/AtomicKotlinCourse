// Testing/Task2.kt
package testingExercise2
import atomictest.eq
import atomictest.neq

fun sum(a: Int, b: Int, c: Int): Int = a + b + c

fun main() {
  sum(2,2,2) eq 6
  sum(2,2,2) neq 8
  sum(1,2,3) eq 6
  sum(1,2,3) neq 9
  sum(10,20,30) neq 75
  sum(20,30,20) eq 70
}