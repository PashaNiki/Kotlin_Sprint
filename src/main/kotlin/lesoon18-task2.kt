package org.example

import kotlin.random.Random

open class Dice(
    private val sides: Int
) {
    open fun roll() {
        val result = Random.nextInt(1, sides +1)
        println("Бросок кости с $sides гранями: $result")
    }
}

class D4: Dice(4)
class D6: Dice(6)
class D8: Dice(8)

 fun main() {
    val dicesList: List<Dice> = listOf(D4(), D6(), D8())

     for (dice in dicesList){
         dice.roll()
     }
}