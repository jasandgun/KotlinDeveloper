import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val inp = scanner.nextInt()
    val res: Boolean = inp > 0 && 10 > inp
    print(res)
}
