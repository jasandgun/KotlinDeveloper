fun main() {
    val origin = readLine()!!
    tes@for (x in 'a'..'z') {
        if (origin.indexOf(x) != -1) continue@tes
        else print(x)
    }
}