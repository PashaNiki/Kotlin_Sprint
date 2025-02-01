package org.example

import java.io.File

fun File.prependWord(word: String) {
    val existingText = if (this.exists()) this.readText() else ""
    val newText = word.lowercase() + "\n" + existingText
    this.writeText(newText)
}
fun main() {
    val file = File("output.txt")

    file.prependWord("Hello World!")
    file.prependWord("Kotlin")
    file.prependWord("Extension")

    println("Файл записан: ${file.absolutePath}")
}