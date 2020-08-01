fun main() {
    val limit = readLine()!!.toCharArray()
    var j = 'a'
    while (true) {
        if (j == limit[0]) return
        print(j); j++
    }
}