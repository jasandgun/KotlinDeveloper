import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println(IntArray(scanner.nextInt()) { scanner.nextInt() }.filter { it > 0 }.count())
}