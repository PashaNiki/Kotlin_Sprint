package org.example

    const val PERCENTAGE_BUFF_DIVIDER = 100

fun main() {

    val crystal = 7
    val iron = 11
    val buff = 20

    val bonusCrystal = (crystal * buff) / PERCENTAGE_BUFF_DIVIDER
    val bonusIron = (iron * buff) / PERCENTAGE_BUFF_DIVIDER

    println("Бонусная кристаллическая руда: $bonusCrystal")
    println("Бонусная железная руда: $bonusIron" )
}
