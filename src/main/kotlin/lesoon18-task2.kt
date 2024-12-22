package org.example

import kotlin.random.Random

open class Dice {
   protected open var sides: Int = 0

    open fun roll() {
        val result = Random.nextInt(1, sides +1)
        println("Бросок кости с $sides гранями: $result")
    }
}

class FourSidedDice: Dice() {
    override var sides: Int = 4
}

class SixSidedDice: Dice() {
    override var sides: Int = 6
}

class EightSidedDice: Dice() {
    override var sides: Int = 8
}

 fun main() {
    val dicesList: List<Dice> = listOf(
        FourSidedDice(),
        SixSidedDice(),
        EightSidedDice()
     )

     for (dice in dicesList){
         dice.roll()
     }
}