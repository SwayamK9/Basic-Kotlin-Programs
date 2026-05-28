fun main() {
    var n = readLine()!!.toInt()
    if (n == 0) {
        println(1)
        return
    }
    var count = 0
    while (n != 0) {
        count++
        n /= 10
    }
    println(count)
}