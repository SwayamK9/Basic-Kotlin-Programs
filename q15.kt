fun main() {
    val n = readLine()!!.toInt()
    var a = 0
    var b = 1
    for (i in 1..n) {
        print("$a ")
        val c = a + b
        a = b
        b = c
    }
}