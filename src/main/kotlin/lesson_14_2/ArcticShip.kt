package org.example.lesson_14_2

class ArcticShip(
    override val name: String = "Ледокол",
    override val speed: Int = 15,
    override val capacity: Int = 100
) : Ship(name, speed, capacity) {

    override fun load() {
        println("$name: Открываем ворота со стороны кормы.")
    }

    override fun displayInfo() {
        println("Корабль: $name, Скорость: $speed км/ч, Грузоподъемность: $capacity. Способен колоть лед.")
    }
}