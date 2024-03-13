// Testing/Task3.kt
package testingExercise3
import atomictest.eq

fun squareArea(x: Int) = x * x

fun rectangleArea(x: Int, y: Int) = x * y

fun trapezoidArea(x: Int, y: Int, h: Int): Double = ((x+y)/2.0)*h

fun main() {
  squareArea(1) eq 1
  squareArea(2) eq 4
  squareArea(5) eq 25

  rectangleArea(1,2) eq 2
  rectangleArea(4, 2) eq 8
  rectangleArea(2, 4) eq 8

  trapezoidArea(2,2, 2) eq 4.0
  trapezoidArea(4,4,2) eq 8.0
  trapezoidArea(3,4,1) eq 3.5
}