package org.example

const val INITIAL_HEALTH = 50
const val MAXIMUM_HEALTH = 100

class Player(
    var name: String,
    var currentHealth: Int = INITIAL_HEALTH,
    var maxHealth: Int = MAXIMUM_HEALTH
)

fun Player.isHealthy(): Boolean {
    return this.currentHealth == this.maxHealth
}

fun main() {
    val player = Player(name = "Ярослав")

    println("${player.name} здоров? ${player.isHealthy()}")

    player.currentHealth = MAXIMUM_HEALTH
    println("${player.name} здоров? ${player.isHealthy()}")
}
