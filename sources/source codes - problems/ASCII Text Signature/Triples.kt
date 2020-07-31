import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val siz = scanner.nextInt()
    val numb = IntArray(siz)
    var flag = 0
    var res = 0
    for (x in 0 until siz) {
        numb[x] = scanner.nextInt()
    }
    for (i in 0..siz - 3) {
        var curr = numb[i]
        for (j in i..i + 2) {
            if (numb[j] == curr + 1) {
                flag += 1
            } else flag = 0
            if (flag == 2) {
                flag = 0
                res += 1
            }
            curr = numb[j]
        }
    }
    println(res)
}

/*
Sisyphus shorter solution
// Posted from EduTools plugin
import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val array = IntArray(scan.nextInt()) { scan.nextInt() }
    var triples = 0

    for (i in 0..(array.lastIndex - 2))
        if (array[i + 1] == array[i] + 1 && array[i + 2] == array[i + 1] + 1)
            triples++

    print(triples)
}
 */