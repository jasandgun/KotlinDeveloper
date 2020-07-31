package signature

import java.io.File

fun main () {
    print("Enter name and surname: ")
    val name = readLine()!!
    print("Enter person's status: ")
    val stat = readLine()!!
    generate(name, stat)
}
//Function to print upper and lower borders and call other related functions
fun generate (name: String, stat: String) {
    val rfFile = File("C:/fonts/roman.txt").readLines(Charsets.US_ASCII)
    val mfFile = File("C:/fonts/medium.txt").readLines(Charsets.US_ASCII)

    val nameLength = nameCount(name, rfFile)
    val statLength = statCount(stat.toUpperCase(), mfFile)
    val border = if (nameLength < statLength) statLength else nameLength

    //upper border
    print("8".repeat(border + 9))
    println()
    //main
    draw(name, stat.toUpperCase(), nameLength, statLength, border, rfFile, mfFile)
    //lower border
    print("8".repeat(border + 9))
}
//Function to count how many spaces are there in the status
fun statCount (stat: String, mfFile: List<String>): Int {
    val mfSize = IntArray(26) { 0 }
    var (sum, iterator) = arrayOf(0, 0)

    for (x in 1..101 step 4) {
        val store = mfFile[x].split(' ')
        mfSize[iterator] += store[1].toInt()
        iterator++
    }
    for (x in stat.indices) {
        sum += if (stat[x] != ' ') {
            val ind = stat[x] - 'A'
            mfSize[ind]
        } else 5
    }
    return sum - 1
}
//Function to count how many spaces are there in the name
fun nameCount (name: String, rfFile: List<String>): Int {
    val rfSize = IntArray(52) { 0 }
    var (sum, iterator) = arrayOf(0, 0)

    for (x in 1..562 step 11) {
        val store = rfFile[x].split(' ')
        rfSize[iterator] += store[1].toInt()
        iterator++
    }
    for (x in name.indices) {
        sum += if (name[x] != ' ') {
            val ind = if (name[x].isUpperCase()) {
                name[x] - 'A' + 26
            } else name[x] - 'a'
            rfSize[ind]
        } else 10
    }
    return sum - 1
}
//Function to print name and status
fun draw (name: String, stat: String, nameLength: Int, statLength: Int, borderLength: Int, rfFile: List<String>, mfFile: List<String>) {
    //Name
    val rfIndex = IntArray(52) { 0 }
    //Store the starting index of letters from roman font
    for ((rfIterator, a) in (2..563 step 11).withIndex()) rfIndex[rfIterator] += a
    //Print name
    for (x in 0..9) {
        print("88  " + " ".repeat((borderLength - nameLength) / 2))
        for (a in name.indices) {
            if (name[a] == ' ') {
                print(" ".repeat(10))
            } else {
                val loc = if (name[a].isUpperCase()) name[a] - 'A' + 26 else name[a] - 'a'
                print(rfFile[rfIndex[loc] + x])
            }
        }
        print(" ".repeat((borderLength - nameLength + 1) / 2) + "  88\n")
    }
    //Status
    val mfIndex = IntArray(26) { 0 }
    //Store the starting index of letters from medium font
    for ((mfIterator, b) in (2..102 step 4).withIndex()) mfIndex[mfIterator] += b
    //Print status
    for (y in 0..2) {
        print("88  " + " ".repeat((borderLength - statLength) / 2))
        for (b in stat.indices) {
            if (stat[b] == ' ') {
                print(" ".repeat(5))
            } else {
                val loc = mfIndex[stat[b] - 'A']
                print(mfFile[loc + y])
            }
        }
        print(" ". repeat((borderLength - statLength + 1) / 2) + "  88\n")
    }
}