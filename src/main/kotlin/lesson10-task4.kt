package org.example

fun rollDice(): Int {
    return (1..6).random()
}

fun playRound(): Boolean {
    println("Ход игрока")
    val playerRoll = rollDice()
    println("Игрок выбросил: $playerRoll")

    println("Ход компьютера")
    val computerRoll = rollDice()
    println("Компьютер выборсил: $computerRoll")

    return when {
        playerRoll > computerRoll -> {
            println("Победило человечество!")
            true
        }
        playerRoll < computerRoll -> {
            println("Победила машина!")
            false
        }
        else -> {
            println("Победила дружба!")
            false
        }
    }
}

fun main() {
    var playAgain = true
    var playerWins = 0

    while (playAgain) {
        val playWon = playRound()
        if(playWon) {
            playerWins++
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val response = readln().trim().lowercase()

        playAgain = response.equals("да", ignoreCase = true)
    }
    println("Игра окончна. Вы выиграли $playerWins партий")
}