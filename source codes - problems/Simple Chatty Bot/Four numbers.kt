import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var rep = 4
    var num: Int
    while (rep != 0) {
        num = scanner.nextInt()
        println(num)
        rep--
    }
}