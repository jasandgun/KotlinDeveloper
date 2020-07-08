fun main() {
    val input = readLine()!!.toString()
    var result = 'a'
    one@ for (x in input.indices) {
        if (input[x].isDigit()) {
            result = input[x]
            break@one
        }
    }
    println(result)
}