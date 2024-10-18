package org.example

const val REQUIRED_HUMIDITY = 20
const val SEASON = "зима"


fun main() {

    val isSunny = true
    val isTentOpen = true
    val airHumidity = 20
    val currentSeason = "зима"

    val favorableConditions = isSunny && isTentOpen && airHumidity == REQUIRED_HUMIDITY && currentSeason != SEASON

    println("Благоприятные ли условия сейчас для роста бобовых?: $favorableConditions")

}