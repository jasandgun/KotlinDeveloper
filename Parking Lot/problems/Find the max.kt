import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val array = IntArray(scanner.nextInt()) { scanner.nextInt() }
    println(array.indexOf(array.max()!!))
}