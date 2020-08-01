fun main() {
    val strInp = readLine()!!.split(' ').toTypedArray()
    val length = IntArray(strInp.lastIndex + 1) { 0 }
    for (x in strInp.indices)
        length[x] = strInp[x].length
    println(strInp[length.indexOf(length.max()!!)])
}

//alternative one-line code
/*
fun main() = print(readLine()!!.split(" ").maxBy { it.length })
 */