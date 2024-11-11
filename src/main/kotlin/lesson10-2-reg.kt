package org.example

const val LENGHT = 4

fun isValidLength(input: String): Boolean {
    return input.length >= LENGHT
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