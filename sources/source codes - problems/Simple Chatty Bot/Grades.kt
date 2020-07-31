import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val rep = scanner.nextInt()
    val gradeSum = Array(4) { 0 }
    repeat(rep) {
        val grade = scanner.nextInt()
        if (grade == 2) gradeSum[grade - 2] += 1
        if (grade == 3) gradeSum[grade - 2] += 1
        if (grade == 4) gradeSum[grade - 2] += 1
        if (grade == 5) gradeSum[grade - 2] += 1
    }
    for (x in 0..3) {
        print("${gradeSum[x]} ")
    }
}
