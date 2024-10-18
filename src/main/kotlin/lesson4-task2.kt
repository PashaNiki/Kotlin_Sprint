package org.example

fun main() {

    val minWeight = 35.0
    val maxWeight = 100.0
    val maxVolume = 100.0

    val weight1 = 20.0
    val volume1 = 80.0

    println("Груз с $weight1 и $volume1 соответствует категории 'Average': " +
            (weight1 > minWeight && weight1 <= maxWeight && volume1 < maxVolume))

    val weight2 = 50.0
    val volume2 = 100.0

    println("Груз с $weight2 и $volume2 соответствует категории 'Average': " +
            (weight2 > minWeight && weight2 <= maxWeight && volume2 < maxVolume))

}