import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val rep = scanner.nextInt()
    var (ready, fix, reject) = arrayOf(0, 0, 0)
    repeat(rep) {
        when (scanner.nextInt()) {
            -1 -> reject++
            0 -> ready++
            1 -> fix++
        }
    }
    println("$ready $fix $reject")
}
