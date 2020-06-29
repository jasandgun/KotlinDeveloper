import java.util.Scanner
import kotlin.math.absoluteValue

fun main() {
    val scanner = Scanner(System.`in`)
    val one = intArrayOf(3600, 60, 1)
    val two = intArrayOf(3600, 60, 1)
    for (j in 0..2) {
        val inp = scanner.nextInt()
        one[j] *= inp
    }
    for (j in 0..2) {
        val inp = scanner.nextInt()
        two[j] *= inp
    }
    val res = two.sum() - one.sum()
    println(res.absoluteValue)
}