package org.example

class Player(
    val name: String,
    var hasKey: Boolean
)

fun main() {

    val checkKey: (Player) -> String = { player: Player ->
        if (player.hasKey) "Игрок открыл дверь" else "Дверь заперта"
    }

        val playerWithKey = Player(name = "Женя", hasKey = true)
        val playerWithoutKey = Player(name = "Катя", hasKey = false)

        println("${playerWithoutKey.name}: ${checkKey(playerWithKey)}")
        println("${playerWithoutKey.name}: ${checkKey(playerWithoutKey)}")
    }