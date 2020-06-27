import java.util.*
import kotlin.math.absoluteValue

fun getLastDigit(a: Int): Int = a.absoluteValue % 10

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}