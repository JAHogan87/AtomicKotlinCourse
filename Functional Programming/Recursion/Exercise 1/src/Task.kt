// Recursion/Task1.kt
package recursionExercise1
import atomictest.*

tailrec fun simulation(group: String, level: Int) {
  TODO()
}

fun main() {
  simulation("FOO", 10)
  trace eq """
    Simulation: FOO Reality: 10
    Simulation: FOO Reality: 9
    Simulation: FOO Reality: 8
    Simulation: FOO Reality: 7
    Simulation: FOO Reality: 6
    Simulation: FOO Reality: 5
    Simulation: FOO Reality: 4
    Simulation: FOO Reality: 3
    Simulation: FOO Reality: 2
    Simulation: FOO Reality: 1
    Simulation: FOO Reality: 0
  """
}