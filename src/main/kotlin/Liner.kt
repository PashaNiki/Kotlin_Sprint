package org.example

open class Liner(
    open val name: String,
    open val speed: Int,
    open val capacity: Int
) {
    open fun displayInfo() {
        println("Корабль: $name, Скорость: $speed км/ч, Вместимость: $capacity")
    }
}