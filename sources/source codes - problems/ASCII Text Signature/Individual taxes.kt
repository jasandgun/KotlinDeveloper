import java.util.*
//Inefficient
fun main() {
    val scanner = Scanner(System.`in`)
    val companies = DoubleArray(scanner.nextInt()) { scanner.nextDouble() }
    var max = 0.0
    var ind = 0
    for (x in companies.indices) {
        companies[x] *= scanner.nextDouble() / 100
        if (companies[x] > max) {
            max = companies[x]
            ind = x
        }
    }
    println(ind + 1)
}

/*
My alter solution, weirdly won't work without another array
fun main() {
    val scanner = Scanner(System.`in`)
    val companies = DoubleArray(scanner.nextInt()) { scanner.nextDouble() }
    for (x in companies.indices)
        companies[x] *= scanner.nextDouble() / 100
    println(companies.indexOf(companies.max()!!) + 1)
}
 */
//Best solution
/*
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val companies = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val tax = IntArray(companies.size) { companies[it] * scanner.nextInt() }
    println(tax.indexOf(tax.max()!!) + 1)
}
 */