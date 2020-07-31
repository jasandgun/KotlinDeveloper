import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    var rep = 1
    var maxrep = 0
    while (scanner.hasNextInt()) {
        val curr = scanner.nextInt()
        if (curr > max) {
            max = curr
            maxrep = rep
        }
        rep++
    }
    println("$max $maxrep")
}