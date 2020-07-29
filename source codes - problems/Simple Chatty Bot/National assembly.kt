import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val inp: Int = scanner.nextInt()
    val res: Double = inp.toDouble()
    print(Math.cbrt(res).toInt())
}