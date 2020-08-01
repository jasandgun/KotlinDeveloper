data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        return if (other is Client)
            name == other.name && age == other.age
        else false
    }
}

fun main() {
    val lineOne = readLine()!!.split(' ')
    val lineTwo = readLine()!!.split(' ')
    val clientOne = Client(lineOne.first(), lineOne[1].toInt(), lineOne.last().toInt())
    val clientTwo = Client(lineTwo.first(), lineTwo[1].toInt(), lineTwo.last().toInt())
    println(clientOne.equals(clientTwo))
}

/*
Alternate
data class Client(val name: String, val age: Int) {
    val balance: Int = 0
}

fun main() {
    val lineOne = readLine()!!.split(' ')
    val lineTwo = readLine()!!.split(' ')
    val clientOne = Client(lineOne.first(), lineOne[1].toInt())
    val clientTwo = Client(lineTwo.first(), lineTwo[1].toInt())
    println(clientOne.equals(clientTwo))
}

 */