import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.next().toCharArray()
    var rotate = scanner.nextInt()
    if (rotate > a.size) rotate = 0
    repeat(rotate) {
        val temp = a.first()
        for (x in 1 until a.size)
            a[x - 1] = a[x]
        a[a.lastIndex] = temp
    }
    for (elem in a) print(elem)
}

/*
Solutions
//Asuras' solution
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val s = scanner.next()
    val n = scanner.nextInt()
    println(s.drop(n) + s.take(n))
}

//Dominik Urban's solution
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val s = scanner.next()
    val n = scanner.nextInt()
    if (n < s.length) println(s.substring(n) + s.substring(0 until n)) else println(s)
}

 */