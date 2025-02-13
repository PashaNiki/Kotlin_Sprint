package org.example.lesson_14

fun main() {
        val cargoShip = CargoShip()
        val iceBreaker = IceBreaker()
        val passengerLiner = PassengerLiner()

        cargoShip.displayInfo()
        iceBreaker.displayInfo()
        iceBreaker.breakIce()
        passengerLiner.displayInfo()
    }