package parking

fun main() {
    val info = readLine()!!.toString().split(' ')
    val parkingSpace = arrayOf("occupied", "")
    if (info.first() == "leave") {
        val index = info[1].toInt() - 1
        println(if (parkingSpace[index].isEmpty()) {
            "There is no car in spot ${index + 1}."
        } else {
            "Spot ${index + 1} is free."
        })
    } else if (info.first() == "park") {
        val emptyIndex = parkingSpace.indexOf("") + 1
        val carColor = info.last()
        println("$carColor car parked in spot $emptyIndex.")
    }
}
