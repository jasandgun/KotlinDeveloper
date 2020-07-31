import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = scanner.nextInt()
    var minimum = 0
    while (scanner.hasNextInt()) {
        val cost = scanner.nextInt()
        if (balance - cost < 0) {
            minimum += cost
        } else {
            balance -= cost
        }
    }
    println(if (minimum == 0) {
        "Thank you for choosing us to manage your account! You have $balance money."
    } else {
        "Error, insufficient funds for the purchase. You have $balance, but you need $minimum."
    })
}