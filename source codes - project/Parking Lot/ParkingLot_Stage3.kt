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

/*
Dmitry Maximov's solution

package parking

import java.util.*

class Parking (val amoutOfSpots: Int){
    private val parking: MutableMap<Int, Car> = mutableMapOf()

    class Car(val number: String, val color: String)

    private fun getFreeSpot(): Int{
        for (i in 1..parking.size+1){
            if (parking.containsKey(i)){
                continue
            } else {
                return i
            }
        }
        return 0
    }

    fun park(car: Car): Int{
        val freeSpot = getFreeSpot()
        if (freeSpot > amoutOfSpots) return 0
        parking[freeSpot] = car
        return freeSpot
    }

    fun leave(spot: Int): String{
        return if (parking.containsKey(spot)){
            parking.remove(spot)
            "OK"
        } else {
            "Taken?"
        }
    }

}
fun main() {
    val parking = Parking(20)
    val scanner = Scanner(System.`in`)
    loop@ while(true){
        when (scanner.next()){
            "park" -> {
                val number = scanner.next()
                val color = scanner.next().toLowerCase()
                val car = Parking.Car(number, color)
                val parkedSpot = parking.park(car)
                if (parkedSpot == 0){
                    println("Sorry, parking lot is full.")
                } else println("${color.capitalize()} car parked on the spot $parkedSpot.")
            }
            "leave" -> {
                val spot = scanner.nextInt()
                val result = parking.leave(spot)
                if (result == "OK") println("Spot $spot is free.")
                else println("There is no car in the spot $spot.")
            }
            "exit" -> break@loop
        }
    }
}

 */