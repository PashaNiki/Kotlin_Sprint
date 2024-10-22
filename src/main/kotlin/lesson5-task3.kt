package org.example

fun main() {

    val correctNumber1 = 15
    val correctNumber2 = 57

    println("Введите превое число (от 0 до 42):")
    val userNumber1 = readln().toInt()

    println("Введите превое число (от 0 до 42):")
    val userNumber2 = readln().toInt()

    val FirstNumberGood1 = (userNumber1 == correctNumber1 || correctNumber1 == userNumber2)
    val FirstNumberGood2 = (userNumber2 == correctNumber1 || correctNumber2 == userNumber2)

    val result = when {
        FirstNumberGood1 && FirstNumberGood2 -> "Поздравляем! Вы выиграли главный приз!"
        FirstNumberGood1 || FirstNumberGood2 -> "Вы выиграли утешительный приз"
        else -> "Неудача"
    }
    println(result)
}