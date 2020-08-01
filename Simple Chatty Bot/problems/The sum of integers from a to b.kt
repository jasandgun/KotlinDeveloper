import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var res = 0
    for (i in scanner.nextInt()..scanner.nextInt()) {
        res += i
    }
    print(res)
}
