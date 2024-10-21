package org.example

import java.time.Year

const val AGE_OF_MAJORITY = 18

fun main() {

    println("Введите ваш год рождения:")
    val birthYear = readln().toIntOrNull()

    val currentYear = Year.now().value
    val userAge = birthYear?.let { currentYear - it } ?: -1

    val resultText = when {
        userAge >= AGE_OF_MAJORITY -> "Показать экран со скрытым контентом"
        userAge in 16..17 -> "Показать экран со ограниченным контентом"
        userAge < AGE_OF_MAJORITY && userAge >= 0 -> "Вернуться на главный экран"
    else -> "Некорректный воод. Введите число"
    }
    println(resultText)
}