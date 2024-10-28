package org.example

fun main() {

    val Count = 3

    val password = StringBuilder()

    for (i in 1..Count) {
        val word = ('a'..'z').random()
        password.append(word)

        val digit =(0..9).random()
        password.append(digit)
    }
    println("Пароль: $password")
}