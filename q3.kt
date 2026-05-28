fun sum(n: Int): Int {
    var s = 0
    for (i in 1..n) {
        s += i
    }
    return s
}

fun main() {
    val n = readLine()!!.toInt()
    println(sum(n))
}