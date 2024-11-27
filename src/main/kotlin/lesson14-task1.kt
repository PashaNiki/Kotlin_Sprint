package org.example

    fun main() {
        val cargoShip = CargoShip()
        val iceBreaker = IceBreaker()
        val passengerLiner = PassengerLiner()

        cargoShip.displayInfo()
        iceBreaker.displayInfo()
        iceBreaker.breakIce()
        passengerLiner.displayInfo()
    }