package org.example

fun generatePass(lenght: Int): String {

    val digits = "0123456789"
    val specialChars = "!\"#\$%&'()*+,-./ "

    val password = StringBuilder()

    for (i in 0 until lenght) {
        val char = if (i % 2 == 0) {
            digits.random()
        } else {
            specialChars.random()
        }
        password.append(char)
    }
    return password.toString()

}

fun main() {

    println("Введите длину пароля:")
    val lenght = readln().toInt()

    val password = generatePass(lenght)
    println("Сгенерированный пароль: $password")

}