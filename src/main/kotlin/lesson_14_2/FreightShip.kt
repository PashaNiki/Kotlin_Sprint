package org.example.lesson_14_2

class FreightShip(
    override val name: String = "Грузовой корабль",
    override val speed: Int = 20,
    override val capacity: Int = 2000
) : Ship(name, speed, capacity) {

    override fun load() {
        println("$name: Активируем погрузочный кран.")
    }

    override fun displayInfo() {
        println("Корабль: $name, Скорость: $speed км/ч, Грузоподъемность: $capacity")
    }
}