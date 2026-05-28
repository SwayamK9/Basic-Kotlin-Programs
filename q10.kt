fun isVowel(c: Char): Boolean {
    return c.lowercaseChar() in charArrayOf('a', 'e', 'i', 'o', 'u')
}

fun main() {
    val c = readLine()!![0]
    if (isVowel(c)) println("Vowel") else println("Consonant")
}