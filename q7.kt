fun largest(a: Int, b: Int, c: Int): Int {
    return if (a > b && a > c) a else if (b > c) b else c
}

fun main() {
    println(largest(10, 25, 15))
}