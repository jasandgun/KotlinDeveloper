import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    if (num % 2 == 0) {
        print(num + 2)
    } else {
        print(num + 1)
    }
}
