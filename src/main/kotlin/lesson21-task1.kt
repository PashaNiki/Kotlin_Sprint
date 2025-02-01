package org.example

fun String.vowelCount(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    return this.count { it.lowercaseChar() in vowels }
}

fun main() {
    val word = "hello"
    println("\"$word\" содержит ${word.vowelCount()} гласных")

    val word2 = "education"
    println("\"$word2\" содержит ${word2.vowelCount()} гласных")
}