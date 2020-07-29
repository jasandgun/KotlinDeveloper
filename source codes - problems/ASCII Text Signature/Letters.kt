fun main() {
    val letters = mutableMapOf<Int, Char>()
    var counter = 1
    do {
        val letter = readLine()!!.toString()
        letters[counter] = letter[0]
        if (counter < 4 && letter == "z") {
            println(null)
            return
        }
        counter++
    } while (letter != "z")
    println(letters[4])
}