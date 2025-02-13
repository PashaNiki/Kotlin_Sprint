package org.example.lesson_14

class CargoShip(
    override val name: String = "Грузовой корабль",
    override val speed: Int = 20,
    override val capacity: Int = 2000
) : Liner(name, speed, capacity) {

    override fun displayInfo() {
        println("Корабл: $name, Скорость: $speed км/ч, Грузоподъемность: $capacity")
    }
}