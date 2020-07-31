fun main() {
    val words = mutableMapOf<String, Int>()
    var inp = readLine()!!.toString()
    if (inp == "stop") {
        println(null)
        return
    }
    while (inp != "stop") {
        words[inp] = (words[inp] ?: 0) + 1
        inp = readLine()!!.toString()
    }
    println(words.maxBy { it.value }?.key)
}