fun main() {
    val srcStr = readLine()!!
    var finRes = ""
    var (i, y, count) = intArrayOf(0, 1, 1)
    if (srcStr != "") {
        finRes += srcStr[0]
        for (x in 0 until srcStr.lastIndex) {
            if (srcStr[x] == srcStr[x + 1]) {
                count += 1
            } else {
                finRes += count
                finRes += srcStr[x + 1]
                count = 1
                i += 2
            }
            y = count
        }
        finRes += y
    }
    println(finRes)
}

/*
Other solution
//Mariusz Charczuk's solution
fun main() {
    val dna = readLine()!!
    var dnaCoded = dna.first().toString()
    var count = 0
    for (c in dna) {
        if (dnaCoded.last() == c) {
            count++
        } else {
            dnaCoded += "$count$c"
            count = 1
        }
    }
    println(dnaCoded + count)
}
 */