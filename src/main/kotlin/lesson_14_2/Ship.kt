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