fun main() {
    val limit = readLine()!!.toInt()
    var num = 1
    while (num * num <= limit) {
        println(num * num)
        num++
    }
}