fun main() {
    val userInput = readLine()!!.toString()
    println(if (userInput.reversed() == userInput) {
        "yes"
    } else {
        "no"
    })
}