// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(hold: String)
{
    var count = 0
    while(count<hold.length) {
        println(hold[count])
        count++
    }



}

fun main()
{
displayContent("abc")
}
/* Expected output:
a
b
c
*/