fun main() {
    val letter = readLine()!!.toString().toLowerCase()
    println(when (letter[0]) {
        'a', 'i', 'u', 'e', 'o' -> letter[0] - 'a' + 1
        else -> 0
    })
}

/*
Conny's solution - with map

fun main() {
    val letter = readLine()!!
    val vowelConsonant = mutableMapOf<String, Int>()
    for (c in 'a'..'z') {
        if (c in "aeiou") {
            vowelConsonant.put(c.toString(), c - 'a' + 1)
        }
    }
    print(vowelConsonant[letter.toLowerCase()] ?: 0)
}
 */