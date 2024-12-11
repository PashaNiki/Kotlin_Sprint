package org.example

private const val INITIAL_HEALTH = 100
private const val INITIAL_ATTACK_POWER = 25

class Player(val name: String, private var health: Int = INITIAL_HEALTH, private var attackPower: Int = INITIAL_ATTACK_POWER) {

    private fun die() {
        println("$name погибает")
        health = 0
        attackPower = 0
    }

    fun takeDamage(amount: Int) {
        if (health > 0) {
            health -= amount
            println("$name получает $amount урона. Осталось здоровья: $health")
            if (health <= 0) {
                die()
            }
        } else {
            println("$name уже мертв и не может получить урон")
        }
    }
    fun heal(amount: Int) {
        if (health > 0) {
            health += amount
            println("$name исцелен на $amount. Текущее здоровье: $health")
        } else {
            println("$name мертв и не может быть исцелен.")
        }
    }
    fun displayStatus() {
        println("Имя: $name, Здоровье: $health, Сила удара: $attackPower")
    }
}
     fun main(){
         val player = Player("Воин", 100,25)

         player.displayStatus()

         val damage1 = 30
         val healing1 = 20
         val damage2 = 50
         val healing2 = 10
         val damage3 = 50

         player.takeDamage(damage1)
         player.heal(healing1)
         player.takeDamage(damage2)
         player.heal(healing2)
         player.takeDamage(damage3)

         player.heal(30)

         player.displayStatus()
     }

