import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val lwrCs = "abcdefghijklmnopqrstuvwxyz"
    val uprCs = lwrCs.toUpperCase()
    val nums = "1234567890"
    val syms = "?!_-@#$"
    
    val (a, b, c, n) = intArrayOf(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt())
    val finPass = CharArray(n)
    
    for (x in 0 until a)
        finPass[x] = uprCs[x % uprCs.length]
    for (x in a until a + b)
        finPass[x] = lwrCs[x % lwrCs.length]
    for (x in a + b until a + b + c)
        finPass[x] = nums[x % nums.length]
    for (x in a + b + c until n)
        finPass[x] = syms[x % syms.length]
        
    println(finPass)
}
