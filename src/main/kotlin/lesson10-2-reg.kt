package org.example

fun isValidLength(input: String): Boolean {
    return input.length >= 4
}

fun main() {

    println("Введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()

    if (isValidLength(login) && isValidLength(password)) {
        println("С возвращением!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }

}