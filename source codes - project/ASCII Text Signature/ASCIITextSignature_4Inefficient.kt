package signature

import java.io.File
import java.util.*

fun main () {
   print("Enter name and surname: ")
   val name = readLine()!!
   print("Enter person's status: ")
   val stat = readLine()!!
   generate(name, stat)
}

fun generate (name: String, stat: String) {//Function to print upper and lower borders and call other relevant functions
    val romanFont = Scanner(File("C:/fonts/roman.txt"))
    val rfSpec = romanFont.nextLine()
    val rfArr = arrayOf(
            //LowerCase
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            //UpperCase
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine()),
            arrayOf(romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine(), romanFont.nextLine())
    )
    val mediumFont = Scanner(File("C:/fonts/medium.txt"))
    val mfSpec = mediumFont.nextLine()
    val mfArr = arrayOf(
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine()),
            arrayOf(mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine(), mediumFont.nextLine())
    )
    val statLen = statCount(stat.toUpperCase(), mfArr)
    val nameLen = nameCount(name, rfArr)
    val border = if (nameLen < statLen) statLen else nameLen
    //upper border
    print("8".repeat(border + 9))
    println()
    //main
    draw(name, stat.toUpperCase(), nameLen, statLen, border, rfArr, mfArr)
    //lower border
    print("8".repeat(border + 9))
}

fun statCount (stat: String, mfArr: Array<Array<String>>): Int {
    var sum = 0
    for (x in stat.indices) {
        sum += if (stat[x] != ' ') {
            val ind = stat[x] - 'A'
            val split = mfArr[ind][0].split(' ')
            split.last().toInt()
        } else 4
    }
    return sum - 1
}

fun nameCount (name: String, rfArr: Array<Array<String>>): Int {
    var sum = 0
    for (x in name.indices) {
        sum += if (name[x] != ' ') {
            val ind = if (name[x].isUpperCase()) {
                name[x] - 'A' + 26
            } else name[x] - 'a'
            val split = rfArr[ind][0].split(' ')
            split.last().toInt()
        } else 10
    }
    return sum - 1
}

fun draw (name: String, stat: String, nameLen: Int, statLen: Int, borderLen: Int, rfArr: Array<Array<String>>, mfArr: Array<Array<String>>) {
    for (x in 1..9) {
        print("88  " + " ".repeat((borderLen - nameLen) / 2))
        name.forEach { print((if (it == ' ') " ".repeat(10) else rfArr[if (it.isUpperCase()) it.toLowerCase() - 'a' + 26 else it - 'a'][x])) }
        print(" ".repeat((borderLen - nameLen + 1) / 2) + "  88\n")
    }
    for (y in 1..3) {
        print("88  " + " ".repeat((borderLen - statLen) / 2))
        stat.forEach { print((if (it == ' ') "    " else mfArr[it - 'A'][y])) }
        print(" ". repeat((borderLen - statLen + 1) / 2) + "  88\n")
    }
}