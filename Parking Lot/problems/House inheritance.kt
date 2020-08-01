//Original solution
fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = House(rooms, price)
    println(totalPrice(house))
}

data class House(val rooms: Int, val price: Int) {
    val coefficient = when (rooms) {
        1 -> 1.0
        2, 3 -> 1.2
        4 -> 1.25
        in 5..7 -> 1.4
        in 8..Int.MAX_VALUE -> 1.6
        else -> 1.0
    }
    val finalPrice = when (price) {
        in 1_000_000..Int.MAX_VALUE -> 1_000_000
        in Int.MIN_VALUE..0 -> 0
        else -> price
    }
}

fun totalPrice(house: House): Int {
    return (house.finalPrice * house.coefficient).toInt()
}
/*
//Ruslan Atsabryk's proper solution using inheritance (my adaptation)

open class House(val rooms: Int, val price: Int, val coefficient: Double)
class Cabin(rooms: Int, price: Int) : House(rooms, price, 1.0)
class Bungalow(rooms: Int, price: Int) : House(rooms, price, 1.2)
class Cottage(rooms: Int, price: Int) : House(rooms, price, 1.25)
class Mansion(rooms: Int, price: Int) : House(rooms, price, 1.4)
class Palace(rooms: Int, price: Int) : House(rooms, price, 1.6)

fun main() {
    var rooms = readLine()!!.toInt()
    rooms = if (rooms < 1) 1 else if (rooms > 10) 10 else rooms
    var price = readLine()!!.toInt()
    price = if (price < 0) 0 else if (price > 1_000_000) 1_000_000 else price
    val house = when (rooms) {
        1 -> Cabin(rooms, price)
        in 2..3 -> Bungalow(rooms, price)
        4 -> Cottage(rooms, price)
        in 5..7 -> Mansion(rooms, price)
        else -> Palace(rooms, price)
    }
    println(totalPrice(house))
}

fun totalPrice(house: House): Int {
    return (house.price * house.coefficient).toInt()
}
*/