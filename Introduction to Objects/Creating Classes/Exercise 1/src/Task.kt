// CreatingClasses/Task1.kt
package creatingClassesExercise1

class SomeClass{
    fun a() = print("42")
    fun b() = a()
    fun c() = b()

}

fun main() {
    val A = SomeClass()
    println(A.a())
}