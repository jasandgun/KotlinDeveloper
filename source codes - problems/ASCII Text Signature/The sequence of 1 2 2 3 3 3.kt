//User 20670741's solution
fun main() {
    var total = readLine()!!.toInt()
    var a = 1
    while (total > 0) {
        repeat(if (a > total) total else a) {
            print("$a ")
        }
        total -= a
        a++
    }
}