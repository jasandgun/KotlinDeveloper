data class Box(val height: Int, val length: Int, val width: Int)

fun main() {
    val boxData = readLine()!!.split(' ')
    val boxOne = Box(boxData[0].toInt(), boxData[1].toInt(), boxData[3].toInt())
    val boxTwo = boxOne.copy(length = boxData[2].toInt())
    println("$boxOne\n$boxTwo")
}