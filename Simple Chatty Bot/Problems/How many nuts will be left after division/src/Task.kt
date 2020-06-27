import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val squirrels = scanner.nextInt()
    val nuts = scanner.nextInt()
    print(nuts % squirrels)
}
