fun simpleInterest(p: Double, r: Double, t: Double): Double {
    return (p * r * t) / 100
}

fun main() {
    val p = readLine()!!.toDouble()
    val r = readLine()!!.toDouble()
    val t = readLine()!!.toDouble()
    println(simpleInterest(p, r, t))
}