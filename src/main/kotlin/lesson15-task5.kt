package org.example

interface Movable {
    fun move()
}

interface PassengerTransport {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassenger()
    fun unloadPassenger()
}

interface CargoTransport {
    val maxCargoWeight: Double
    var currentCargoWeight: Double

    fun loadCargo(weight: Double)
    fun unloadCargo(weight: Double)
}

class Truck : Movable, CargoTransport {
    override val maxCargoWeight = 2.0
    override var currentCargoWeight = 0.0

    val maxPassengers = 1
    var currentPassengers = 0

    override fun move() {
        println("Грузовик едет с $currentCargoWeight т груза и $currentPassengers пассажиром.")
    }

    override fun loadCargo(weight: Double) {
        if (currentCargoWeight + weight <= maxCargoWeight) {
            currentCargoWeight += weight
            println("Загружено $weight т груза. Сейчас в грузовике $currentCargoWeight т груза.")
        } else {
            println("Невозможно загрузить $weight т. Перевес")
        }
    }

    override fun unloadCargo(weight: Double) {
        if (currentCargoWeight - weight >= 0) {
            currentCargoWeight -= weight
            println("Выгружено $weight т груза. Сейчас в грузовике $currentCargoWeight т груза.")
        } else {
            println("Невозможно выгрузить $weight т. Недостаточно груза")
        }
    }
}

class Car : Movable, PassengerTransport {
    override val maxPassengers = 3
    override var currentPassengers = 0

    override fun move() {
        println("Легковая машина едет с $currentPassengers пассажирами.")
    }

    override fun loadPassenger() {
        if (currentPassengers < maxPassengers) {
            currentPassengers++
            println("Посадили пассажира. Сейчас в машине $currentPassengers пассажиров.")
        } else {
            println("Машина переполнена. Невозможно посадить пассажира.")
        }
    }

    override fun unloadPassenger() {
        if (currentPassengers > 0) {
            currentPassengers--
            println("Высадили пассажира. Сейчас в машине $currentPassengers пассажиров.")
        } else {
            println("В машине нет пассажиров для высадки.")
        }
    }
}

    fun main() {
        val truck = Truck()
        val car1 = Car()
        val car2 = Car()

        println("Перевозка груза")
        truck.loadCargo(1.5)
        truck.loadCargo(0.5)
        truck.move()
        truck.unloadCargo(2.0)

        println("\nПеревозка пассажиров")
        car1.loadPassenger()
        car1.loadPassenger()
        car1.loadPassenger()
        car1.move()

        car2.loadPassenger()
        car2.loadPassenger()
        car2.move()

        car1.unloadPassenger()
        car2.unloadPassenger()
    }