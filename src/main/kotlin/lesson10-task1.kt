package org.example

import kotlin.random.Random

fun rollDice(): Int {
    return Random.nextInt(1,7)
}

fun main() {

    println("Ходи игрока")
    val playerMove = rollDice()
    println("Игрок выбросил: $playerMove")

    println("Ход компьютера")
    val computerMove = rollDice()
    println("Компьютер выборсил: $computerMove")

    when {
        playerMove > computerMove -> println("Победило человечерство!")
        playerMove < computerMove -> println("Победила машина!")
        else -> println("Победила дружба!")
    }
}
