import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var prev = Int.MIN_VALUE
    var flag = 1
    for (x in 1..scanner.nextInt()) {
        val now = scanner.nextInt()
        if (now > prev) {
            prev = now
            flag = 1
        } else {
            flag = 0
            print("NO")
            break
        }
    }
    if (flag == 1) print("YES")
}
