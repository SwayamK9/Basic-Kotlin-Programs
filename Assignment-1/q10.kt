fun isVowel(c: Char): Boolean {
    return c in "aeiouAEIOU"
}

fun main() {
    if (isVowel('a')) println("Vowel") else println("Consonant")
}