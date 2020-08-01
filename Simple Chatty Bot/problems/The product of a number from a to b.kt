import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var res: Long = 1
    for (j in scanner.nextInt() until scanner.nextInt()) {
        res *= j
    }
    println(res)
}