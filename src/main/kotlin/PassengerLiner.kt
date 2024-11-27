package org.example

class PassengerLiner(
    override val name: String = "Пассажирский лайнер",
    override val speed: Int = 30,
    override val capacity: Int = 500
) : Liner(name, speed, capacity) {

    override fun displayInfo() {
        println("Корабл: $name, Скорость: $speed км/ч, Вместимость: $capacity пассажиров")
    }
}