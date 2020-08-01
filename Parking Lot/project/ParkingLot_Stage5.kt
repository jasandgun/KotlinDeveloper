package parking

data class Cars (var spot: Int = 0, var id: String = "", var color: String = "")

class ParkingLot(desiredSpace: Int, private val flag: Boolean) {
    private var parkingSpace = Array(desiredSpace) { Cars() }

    private fun findSpot():Int {
        for (x in parkingSpace.indices) {
            if (parkingSpace[x].id == "") return x
        }
        return -1
    }

    private fun emptyCheck (): Boolean {
        for (x in parkingSpace.indices) {
            if (parkingSpace[x].id != "") return false
        }
        return true
    }

    fun create(size: Int): ParkingLot {
        println("Created a parking lot with $size spots.")
        return ParkingLot(size, true)
    }

    fun goPark(userInput: List<String>) = if (flag) {
        val freeSpot = findSpot()
        val userCar = Cars(freeSpot + 1, userInput[1], userInput.last())
        if (freeSpot == -1) {
            println("Sorry, the parking lot is full.")
        } else {
            parkingSpace[freeSpot] = userCar
            println("${userCar.color} car parked in spot ${userCar.spot}.")
        }
    } else println("Sorry, a parking lot has not been created.")

    fun goLeave(userInput: List<String>) = if (flag) {
        val leaveSpot = userInput.last().toInt()
        if (parkingSpace[leaveSpot - 1].id == "") {
            println("There is no car in spot $leaveSpot.")
        } else {
            parkingSpace[leaveSpot - 1] = Cars()
            println("Spot $leaveSpot is free.")
        }
    } else println("Sorry, a parking lot has not been created.")

    fun showStatus() = if (flag) {
        val isItEmpty = emptyCheck()
        if (isItEmpty) {
            println("Parking lot is empty.")
        } else {
            for (x in parkingSpace.indices)
                if (parkingSpace[x].id != "")
                    println("${parkingSpace[x].spot} ${parkingSpace[x].id} ${parkingSpace[x].color}")
        }
    } else println("Sorry, a parking lot has not been created.")

    fun regByColor(userInput: List<String>) = if (flag) {
        val colorKey = userInput.last()
        val register = MutableList(0) {""}
        for (x in parkingSpace.indices) {
            if (parkingSpace[x].color.toLowerCase() == colorKey.toLowerCase()) {
                register.add(parkingSpace[x].id)
            }
        }
        println(if (register.isEmpty()) {
            "No cars with color $colorKey were found."
        } else {
            register.joinToString()
        })
    } else println("Sorry, a parking lot has not been created.")

    fun spotByColor(userInput: List<String>) = if (flag) {
        val colorKey = userInput.last()
        val spots = MutableList(0) {0}
        for (x in parkingSpace.indices) {
            if (parkingSpace[x].color.toLowerCase() == colorKey.toLowerCase()) {
                spots.add(parkingSpace[x].spot)
            }
        }
        println(if (spots.isEmpty()) {
            "No cars with color $colorKey were found."
        } else {
            spots.joinToString()
        })
    } else println("Sorry, a parking lot has not been created.")

    fun spotByReg(userInput: List<String>) = if (flag) {
        val registerKey = userInput.last()
        var spots = -1
        for (x in parkingSpace.indices) {
            if (parkingSpace[x].id == registerKey) {
                spots = x + 1
                break
            }
        }
        println(if (spots == -1) {
            "No cars with registration number $registerKey were found."
        } else {
            spots
        })
    } else println("Sorry, a parking lot has not been created.")
}

fun main() {
    var userInput = getCommand()
    var parkingSpace = ParkingLot(0, false)

    while (userInput.first() != "exit") {
        when (userInput.first()) {
            "create" -> parkingSpace = parkingSpace.create(userInput.last().toInt())
            "park"   -> parkingSpace.goPark(userInput)
            "leave"  -> parkingSpace.goLeave(userInput)
            "status" -> parkingSpace.showStatus()
            "reg_by_color" -> parkingSpace.regByColor(userInput)
            "spot_by_color" -> parkingSpace.spotByColor(userInput)
            "spot_by_reg" -> parkingSpace.spotByReg(userInput)
        }
        userInput = getCommand()
    }
}

fun getCommand(): List<String> {
    val fullCommand = readLine()!!.toString()
    return fullCommand.split(' ')
}