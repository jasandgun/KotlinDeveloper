import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    repeat(scanner.nextInt()) {
        val inp = scanner.nextInt()
        if (inp % 4 == 0 && inp >= max) max = inp
    }
    println(max)
}