package org.example

import kotlin.random.Random

class Robot {
    private var phrase: String = ""
    private var modifier: (String) -> String = { it }

    private val phrases = listOf(
        "Валли мой любимый мультфильм",
        "Роботы меняют наш мир",
        "Мне нужны новые колеса на Cybertruc",
        "Люблю SpaceX",
        "Привет! Я Робот"
    )
    fun say() {
        println(modifier(phrase))
    }
    fun setModifier(mod: (String) -> String) {
        this.modifier = mod
    }
    fun generatePhrase() {
        phrase = phrases[Random.nextInt(phrases.size)]
    }
}
    val invertWords: (String) -> String = { phrase ->
        phrase.split(" ").reversed().joinToString(" ")
    }

    fun main() {
        val robot = Robot()

        robot.generatePhrase()
        println("Обычный варинат:")
        robot.say()

        robot.setModifier(invertWords)

        println("\nИнвертированный вариант:")
        robot.say()
    }
