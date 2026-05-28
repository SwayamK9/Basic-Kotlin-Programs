fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    var x = a
    var y = b
    var temp = x
    x = y
    y = temp
    println("$x $y")

    var p = a
    var q = b
    p += q
    q = p - q
    p -= q
    println("$p $q")
}