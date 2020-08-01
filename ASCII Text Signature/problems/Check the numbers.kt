import java.util.*
import kotlin.math.absoluteValue

fun main() {
    val scanner = Scanner(System.`in`)
    val arrays = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val (m, n) = arrayOf(scanner.nextInt(), scanner.nextInt())
    var (flagm, flagn) = arrayOf(1, 1)
    while (arrays.indexOf(m) != -1 || arrays.indexOf(n) != -1) {
        if (arrays.indexOf(m) != -1) {
            val indm = arrays.indexOf(m)
            arrays[indm] = m*n
            if ((indm - arrays.indexOf(n)).absoluteValue == 1 && arrays.indexOf(n) != -1) {
                flagm = 0
                break
            }
        }
        if (arrays.indexOf(n) != -1) {
            val indn = arrays.indexOf(n)
            arrays[indn] = m*n
            if ((indn - arrays.indexOf(m)).absoluteValue == 1 && arrays.indexOf(m) != -1) {
                flagn = 0
                break
            }
        }
    }
    println(if (flagm == 1 && flagn == 1) {
        "YES"
    } else "NO")
}

//Alternative and shorter ans
/*
Anton's solution

import java.util.Scanner
import kotlin.text.Regex

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val nnum = scanner.nextLine()
    val nums = scanner.nextLine()
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val test = Regex("$n $m|$m $n")

    if (test.containsMatchIn(nums))
        println("NO")
    else
        println("YES")
}
 */
/*
Igor Sheremet's solution

// Posted from EduTools plugin
fun main() {
    readLine()!!
    print(readLine()!!.run { readLine()!!.let { if (contains(it) || contains(it.reversed())) "NO" else "YES" } })
}
 */