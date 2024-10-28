package org.example

import kotlin.random.Random

fun main() {

    println("Создайте логин:")
    val createLongin = readln()

    println("Создайте пароль:")
    val createPassword = readln()

    var login: String
    var password: String

    do {
        println("Введите логин:")
        login = readln()

        println("Введите пароль")
        password = readln()

        if (login != createLongin || password != createPassword) {
            println("Неверный логин или пароль, попробуйде еще раз")
        }

    }    while (login != createLongin || password != createPassword)

    var attempts = 3
    var authorized = false

    while (attempts > 0 && !authorized) {
        val number1 = (1..10).random()
        val number2 = (1..10).random()
        val correctAnswer = number1 + number2

        println("Для входа в систему, решите пример: $number1 + $number2")
        val userAnswer = readln().toIntOrNull() ?: -1

        if(userAnswer == correctAnswer) {
            println("Добро пожаловать")
            authorized = true
        } else {
            attempts--
            if (attempts > 0) {
                println("Неверный ответ. У вас осталость $attempts попыток")
            } else {
                println("Доступ запрещен")
            }
        }
    }
}