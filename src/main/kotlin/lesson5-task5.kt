package org.example

import kotlin.random.Random

fun main() {

    val correctNumbers = List(3) { Random.nextInt(0, 43) }

    val userNumbers = mutableListOf<Int>()
    println("Введите три числа от 0 до 42")

    repeat(3) { index ->
        println("Введите число №${index + 1}:")
        val userNumber = readln().toIntOrNull() ?:0
        userNumbers.add(userNumber)
}

    val matches = correctNumbers.intersect(userNumbers).size

    val result = when (matches) {
        3 -> "Ура! Вы угадали все три числа и выйграли джекпот!"
        2 -> "Вы угадали два числа и получаете крупный приз!"
        1 -> "Вы угадали одно число и получаете утешительный приз!"
        else -> "Вы не угадали ни одного числа"
    }
    println(result)
    println("Выигрышные числа: $correctNumbers")
}