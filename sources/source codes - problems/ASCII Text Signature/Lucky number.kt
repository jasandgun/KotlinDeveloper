fun main() {
    val numbers = readLine()!!.toCharArray()
    var (sum1, sum2) = intArrayOf(0, 0)
    for (a in numbers.indices) {
        if (a + 1 <= numbers.size / 2) {
            sum1 += numbers[a].toInt()
        } else sum2 += numbers[a].toInt()
    }
    println(if (sum1 == sum2) "YES" else "NO")
}
/*
Mihael Stormrage's solution
fun main() = print(readLine()!!.map { it.toInt() }.run {
    if (take(size / 2).sum() == takeLast(size / 2).sum()) "YES" else "NO" })
 */