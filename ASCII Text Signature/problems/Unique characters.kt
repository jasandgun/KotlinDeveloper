fun main() {
    val input = readLine()!!
    val letr = IntArray(26) { 0 }
    var count = 0
    for (x in input.indices)
        letr[input[x] - 'a'] += 1
    for (x in letr.indices)
        if (letr[x] == 1) count++
    println(count)
}