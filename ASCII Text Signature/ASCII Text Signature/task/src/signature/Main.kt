package signature

fun main() {//Prints user interface and accept user input
    print("Enter name and surname: ")
    val name = readLine()!!
    print("Enter person's status: ")
    val stat = readLine()!!
    generate(name.toUpperCase(), stat)
}

fun generate (name: String, stat: String) {//Function to print upper and lower borders and call other relevant functions
    val nameLength = countStar(name)
    var border = nameLength
    if (border <= stat.length) border = stat.length
    //Prints the upper border
    print("*".repeat(border + 6))
    println()
    //Function call to print the name and status
    drawName(name, stat, border, nameLength)
    //Prints the lower border
    print("*".repeat(border + 6))
}

fun countStar (name: String): Int {//Function to count the amount of asterisk needed for the name only
    var sum = 0
    for (x in name.indices) {
        sum += when (name[x]) {
            'I' -> 1 + 1
            'J' -> 2 + 1
            'T' -> 3 + 1
            'Y', 'W' -> 5 + 1
            ' ' -> 6 - 1
            else -> 4 + 1
        }
    }
    return sum - 1
}

fun drawName (name: String, stat: String, borderLength: Int, nameLength: Int) {
    val nameSpace = (borderLength - nameLength) / 2
    val nameSpace2 = borderLength - nameLength - nameSpace

    //Prints the first layer
    val firstLayer = arrayOf("____", "___ ", "____", "___ ", "____", "____", "____", "_  _", "_",
            " _", "_  _", "_   ", "_  _", "_  _", "____", "___ ", "____", "____",
            "____", "___", "_  _", "_  _", "_ _ _", "_  _", "_   _", "___ ", "     ")
    print("*  ")
    print(" ".repeat(nameSpace))
    for (x in name.indices) {
        if (name[x] == ' ') print(firstLayer.last())
        else print("${firstLayer[name[x] - 'A']} ")
    }
    print(" ".repeat(nameSpace2))
    println(" *")

    //Prints the second layer
    val secondLayer = arrayOf("|__|", "|__]", "|   ", "|  \\", "|___", "|___", "| __", "|__|", "|",
            " |", "|_/ ", "|   ", "|\\/|", "|\\ |","|  |", "|__]", "|  |", "|__/",
            "[__ ", " | ", "|  |", "|  |", "| | |", " \\/ ", " \\_/ ", "  / ", "     ")
    print("*  ")
    print(" ".repeat(nameSpace))
    for (y in name.indices) {
        if (name[y] == ' ') print(secondLayer.last())
        else print("${secondLayer[name[y] - 'A']} ")
    }
    print(" ".repeat(nameSpace2))
    println(" *")

    //Prints the third layer
    val thirdLayer = arrayOf("|  |", "|__]", "|___", "|__/", "|___", "|   ", "|__]", "|  |", "|",
            "_|", "| \\_", "|___", "|  |", "| \\|", "|__|", "|   ", "|_\\|", "|  \\", "___]",
            " | ", "|__|", " \\/ ", "|_|_|", "_/\\_", "  |  ", " /__", "     ")
    print("*  ")
    print(" ".repeat(nameSpace))
    for (z in name.indices) {
        if (name[z] == ' ') print(thirdLayer.last())
        else print("${thirdLayer[name[z] - 'A']} ")
    }
    print(" ".repeat(nameSpace2))
    println(" *")

    //Prints the fourth layer (status)
    print("*  ")
    if (stat.length == borderLength) {
        print(stat)
    } else {
        val statSpace = (borderLength - stat.length) / 2
        print(" ".repeat(statSpace))
        print(stat)
        print(" ".repeat(borderLength - stat.length - statSpace))
    }
    println("  *")
}