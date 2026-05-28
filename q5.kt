fun main() {
    var n = 121
    val x = n
    var rev = 0

    while (n > 0) {
        rev = rev * 10 + n % 10
        n /= 10
    }

    if (x == rev) println("Palindrome") else println("Not Palindrome")
}