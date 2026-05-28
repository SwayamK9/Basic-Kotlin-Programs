fun main() {
    val n = readLine()!!.toInt()
    var fact = 1L
    for (i in 1..n) {
        fact *= i.toLong()
    }
    println(fact)
}