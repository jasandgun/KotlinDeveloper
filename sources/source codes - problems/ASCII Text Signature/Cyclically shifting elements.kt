import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val temp = a.last()
    for (x in a.size - 1 downTo 1)
        a[x] = a[x - 1]
    a[0] = temp
    for (elem in a) print("$elem ")
}
