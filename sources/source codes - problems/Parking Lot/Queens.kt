import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    val (x1, y1, x2, y2) = intArrayOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
    println(when (true) {
        x1 == x2 || y1 == y2 -> "YES"
        abs(x1 - x2) == abs(y1 - y2) -> "YES"
        else -> "NO"
    })
}