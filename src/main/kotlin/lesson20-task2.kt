package org.example

const val INITIAL_HEALTH = 50
const val MAXIMUM_HEALTH = 100

class Player(
    var name: String,
    var currentHealth: Int,
    var maxHealth: Int
)

fun main() {

    val healPotion: (Player) -> Unit = { player: Player ->
        player.currentHealth = player.maxHealth
    }

    val player = Player(
        name = "Ярослав",
        currentHealth = INITIAL_HEALTH,
        maxHealth = MAXIMUM_HEALTH
    )
    println("До использования зелья: ${player.name} - Здоровье ${player.currentHealth}/${player.maxHealth}")
    healPotion(player)
    println("После использования зелья: ${player.name} - Здоровье ${player.currentHealth}/${player.maxHealth}")
}