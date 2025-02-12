package org.example

fun main() {

    println("Введите расстоние поездки (км): ")
    val distance = readln().toDoubleOrNull() ?: return println("Ошибка: Введите корректное расстояние")

    println("Введите расход топлива на 100 км (л): ")
    val fuelConsumption = readln().toDoubleOrNull() ?: return println("Ошибка: Введите корректный расход топлива")

    println("Введите цену за литр топлива (руб): ")
    val fuelPrice = readln().toDoubleOrNull() ?: return println("Ошибка: Введите корректную цену за литр топлива")

    val fuelNeeded = (distance * fuelConsumption) / 100
    val totalCoast = fuelNeeded * fuelPrice

    println("Необходимое топливо: %.2f литров".format(fuelNeeded))
    println("Стоимость поездки: %.2f руб".format(totalCoast))

}