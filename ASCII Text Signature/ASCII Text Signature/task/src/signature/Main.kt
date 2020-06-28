package signature

fun main() {
    val inp = readLine()!!
    repeat(inp.length + 4){
        print('*')
    }
    println("\n* $inp *")
    repeat(inp.length + 4){
        print('*')
    }
}
