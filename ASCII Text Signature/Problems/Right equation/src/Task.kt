import java.util.*

fun isRightEquation(a: Int, b: Int, c: Int) = c == a * b

/* Do not change code below */
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    println(isRightEquation(a, b, c))
}