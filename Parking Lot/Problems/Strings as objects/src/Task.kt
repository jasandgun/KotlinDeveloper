fun main() {
    val input = readLine()!!.toString()
    if (input.isEmpty()) return
    when (input.first()) {
        'i' -> println(input.drop(1).toInt() + 1)
        's' -> println(input.drop(1).reversed())
        else -> println(input)
    }
}