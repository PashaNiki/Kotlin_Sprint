package org.example

import kotlin.random.Random

fun main() {

    var authCode: Int
    var userCode: Int

    while (true) {
        authCode = Random.nextInt(1000, 10000)

        println("Ваш код авторизации N: $authCode")

        println("Введите код авторизации: ")
        userCode = readln().toIntOrNull() ?: 0

        if (userCode == authCode) {
            println("Успешная авторизация")
            break
        } else {
            println("Неверный код. Попробуйте еще раз")
        }
    }
}