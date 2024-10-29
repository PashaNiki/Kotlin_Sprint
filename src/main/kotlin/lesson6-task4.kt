package org.example

import kotlin.random.Random

fun main() {

    val Number = (1..10).random()
    var attempts = 5

    println("Угадайте число от 1 до 9. У вас есть $attempts попыток")

    while (attempts > 0) {
        println("Введите ваше число:")
        val userNumber = readln().toInt()

        if(userNumber == Number) {
            println("Это была великолепная игра!")
            return
        } else {
         attempts--
            println("Неверно. Осталось попыток $attempts")
        }
    }
    println("Было загадано число $attempts")
}