package org.example

fun main() {

    val isSunny = true
    val isTentOpen = true
    val airHumidity = 20
    val currentSeason = "зима"

    val favorableConditions = isSunny && isTentOpen && airHumidity == 20 && currentSeason != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? : $favorableConditions")

}