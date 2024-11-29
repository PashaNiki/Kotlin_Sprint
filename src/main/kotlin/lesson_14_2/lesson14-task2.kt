package org.example.lesson_14_2

fun main() {
    val freingShip = FreightShip()
    val arcticShip = ArcticShip()
    val passengerShip = PassengerShip()

    freingShip.load()
    arcticShip.load()
    passengerShip.load()

    println("Информаиця о кораблях:")
    freingShip.displayInfo()
    arcticShip.displayInfo()
    passengerShip.displayInfo()
}