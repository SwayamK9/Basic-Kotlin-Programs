fun largest(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c) a else if (b >= c) b else c
}

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(largest(a, b, c))
}