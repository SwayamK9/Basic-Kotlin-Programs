fun main() {
    val choice = readLine()!!.toInt()
    if (choice == 1) {
        val c = readLine()!!.toDouble()
        println((c * 9 / 5) + 32)
    } else {
        val f = readLine()!!.toDouble()
        println((f - 32) * 5 / 9)
    }
}