fun main() {
    var numbers = readLine()!!.toInt()
    var sum = 0
    while (numbers != 0) {
        sum += numbers
        numbers = readLine()!!.toInt()
    }
    println(sum)
}