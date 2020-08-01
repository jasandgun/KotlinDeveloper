import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numArr = IntArray(scanner.nextInt()) { 0 }
    for (x in numArr.indices) numArr[x] = scanner.nextInt()
    val searchNum = scanner.nextInt()
    println(if (numArr.contains(searchNum)) {
        "YES"
    } else "NO")
}
/*
Sergej Kovyrshin's solution
import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    print(if (IntArray(scan.nextInt()) { i -> scan.nextInt() }.contains(scan.nextInt())) "YES" else "NO")
}

 */