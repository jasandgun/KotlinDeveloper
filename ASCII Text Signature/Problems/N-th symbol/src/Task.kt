fun main() {
    val input = readLine()!!
    val index = readLine()!!.toInt()
    println("Symbol # $index of the string \"$input\" is \'${input[index - 1]}\'")
}