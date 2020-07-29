import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val rot = scanner.nextInt()
    repeat(rot % a.size) {
        val temp = a.last()
        for (x in a.size - 1 downTo 1)
            a[x] = a[x - 1]
        a[0] = temp
    }
    for (elem in a) print("$elem ")
}

//Other solutions
/*
Serghei Iakovlev's solution

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val input = IntArray(scanner.nextInt()) { scanner.nextInt() }
    var shift = scanner.nextInt()
    if (shift > input.size) { //if wasn't necessary actually
        shift %= input.size
    }

    for (i in input.size - shift..input.lastIndex) print("${input[i]} ")
    for (i in 0 until input.size - shift) print("${input[i]} ")
}
 */