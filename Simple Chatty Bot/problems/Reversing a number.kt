import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var inp = scanner.nextInt()
    var res = 0
    while (inp != 0) {
        res += inp % 10
        res *= 10
        inp /= 10
    }
    print(res / 10)
}