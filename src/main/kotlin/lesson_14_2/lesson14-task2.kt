package org.example.lesson_14_2

open class Ship(
    open val name: String,
    open val speed: Int,
    open val capacity: Int
) {

    open fun load() {
        println("$name: стандартная погрузка.")
    }

    open fun displayInfo() {
        println("Корабль: $name, Скорость: $speed км/ч, Вместимость: $capacity")
    }
}

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

class PassengerShip(
    override val name: String = "Пассажирский лайнер",
    override val speed: Int = 30,
    override val capacity: Int = 500
) : Ship(name, speed, capacity) {

    override fun load() {
        println("$name: Выдвигаем горизонтальный трап со шкафута.")
    }

    override fun displayInfo() {
        println("Корабль: $name, Скорость: $speed км/ч, Вместимость: $capacity пассажиров.")
    }
}

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

fun main() {
    val freightShip = FreightShip()
    val arcticShip = ArcticShip()
    val passengerShip = PassengerShip()

    freightShip.load()
    arcticShip.load()
    passengerShip.load()

    println("Информация о кораблях:")
    freightShip.displayInfo()
    arcticShip.displayInfo()
    passengerShip.displayInfo()
}