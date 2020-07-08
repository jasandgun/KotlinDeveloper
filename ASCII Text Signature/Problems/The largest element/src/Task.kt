fun main() {
    var inp = readLine()!!.toInt()
    var max = Int.MIN_VALUE
    while (inp != 0) {
        if (inp > max) max = inp
        inp = readLine()!!.toInt()
    }
    println(max)
}
