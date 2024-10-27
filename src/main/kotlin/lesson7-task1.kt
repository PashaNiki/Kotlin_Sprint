package org.example

import kotlin.random.Random

fun main() {

    val password = StringBuilder()

    for (i in 1..3) {
        val word = Random.nextInt('a'.code,'z'.code + 1).toChar()
        password.append(word)

        val digit = Random.nextInt(0,10)
        password.append(digit)
    }
    println("Пароль: $password")
}