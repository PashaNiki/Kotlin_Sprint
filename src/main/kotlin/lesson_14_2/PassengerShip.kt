package org.example.lesson_14_2

class PassengerShip(
    override val name: String = "Пассажираский лайнер",
    override val speed: Int = 30,
    override val capacity: Int = 500
) : Ship(name, speed, capacity) {

    override fun load() {
        println("$name: Выдвигаем горизонтальный трап со шкафуута.")
    }

    override fun displayInfo() {
        println("Корабль: $name, Скорость: $speed км/ч, Вместимость: $capacity пассажиров.")
    }
}