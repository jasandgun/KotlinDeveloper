package parking

fun main() {
    var userInput = getCommand()
    val parkingSpace = Array(20) { "" }
    while (userInput.first() != "exit") {
        if (userInput.first() == "park") {
            val parkIndex = parkingSpace.indexOf("") + 1
            if (parkIndex != 0) {
                println("${userInput.last()} car parked in spot $parkIndex.")
                parkingSpace[parkIndex - 1] = userInput[1] + " " + userInput.last()
            } else if (parkIndex == 0) {
                println("Sorry, the parking lot is full.")
            }
        } else if (userInput.first() == "leave") {
            val leaveIndex = userInput.last().toInt()
            if (parkingSpace[leaveIndex - 1] == "") {
                println("There is no car in spot $leaveIndex.")
            } else {
                println("Spot $leaveIndex is free.")
                parkingSpace[leaveIndex - 1] = ""
            }
        }
        userInput = getCommand()
    }
}

fun getCommand(): List<String> {
    val fullCommand = readLine()!!.toString()
    return fullCommand.split(' ')
}