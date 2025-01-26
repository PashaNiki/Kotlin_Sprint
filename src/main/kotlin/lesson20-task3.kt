package org.example

class Player(
    val name: String,
    var hasKey: Boolean
)

val chechKey: (Player) -> String = { player: Player ->
    if (player.hasKey) "Игрок открыл дверь" else "Дверь заперта"
}

fun main() {

    val playerWithKey = Player(name = "Женя", hasKey = true)
    val playerWithoutKey = Player(name = "Катя", hasKey = false)

    val checkKey: (Player) -> String = { player: Player ->
        if (player.hasKey) "Игрок открыл дверь" else "Дверь заперта"
    }
    println("${playerWithoutKey.name}: ${checkKey(playerWithKey)}")
    println("${playerWithoutKey.name}: ${checkKey(playerWithoutKey)}")
}