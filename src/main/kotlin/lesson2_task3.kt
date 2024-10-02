package org.example

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_DAY = 24

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val timeInWay = 475

    val departureMinutes = departureHour * MINUTES_IN_HOUR + departureMinute
    val allMinutesInTrain = departureMinutes + timeInWay

    val arivalHour = (allMinutesInTrain / MINUTES_IN_HOUR) % HOURS_IN_DAY
    val arivalMinute = allMinutesInTrain % MINUTES_IN_HOUR

    println(String.format("%02d:%02d", arivalHour, arivalMinute))
}

