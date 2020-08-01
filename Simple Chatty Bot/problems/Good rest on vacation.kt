import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val days = scanner.nextInt()
    val food = scanner.nextInt() * days
    val flight = scanner.nextInt() * 2
    val hotel = scanner.nextInt() * (days - 1)
    val sum = food + flight + hotel
    print(sum)
}