// StringTemplates/Task3.kt
package stringTemplatesExercise3

fun show(i: Int, s: String, c: Char, d: Double)
{
    print("i: $i\ns: \"$s\"\nc: '$c'\nd: $d\n ")
}

fun main()
{
show(1, "abc", 'd', 2.0)
}
/* Expected output:
i: 1
s: "abc"
c: 'd'
d: 2.0
*/