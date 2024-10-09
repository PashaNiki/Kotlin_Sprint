package org.example

    const val crystal = 7
    const val iron = 11

fun main() {

    val buff = 20
    val percentageBuffDivider = 100

    val bonusCrystal = (crystal * buff) / percentageBuffDivider
    val bonusIron = (iron * buff) / percentageBuffDivider

    println("Бонусная кристаллическая руда: $bonusCrystal")
    println("Бонусная железная руда: $bonusIron" )
}
