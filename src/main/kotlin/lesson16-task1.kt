package org.example

class Dice {
    private val value: Int = (1..6).random()

    fun rollResult() {
        println("Результат броска кубика: $value")
    }
}

fun main() {
    val dice = Dice()
    dice.rollResult()
}