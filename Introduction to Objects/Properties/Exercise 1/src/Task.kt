// Properties/Task1.kt
package propertiesExercise1

class X{
    val a: Int = 3
    val b: Int = 42
    var c: Int = 0

    fun add(): Int {
        c = a + b
        return c
    }



}

fun main() {
    var test = X()

  println(test.add())
}