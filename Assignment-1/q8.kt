fun main() {
    var n = 12345
    var count = 0

    while (n > 0) {
        count++
        n /= 10
    }

    println(count)
}