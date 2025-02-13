package org.example.lesson_14

class IceBreaker (
    override val name: String = "Ледокол",
    override val speed: Int = 15,
    override val capacity: Int = 100
) : Liner(name, speed, capacity) {

    fun breakIce(){
        println("$name: Колем лед")
    }

    override fun displayInfo() {
        println("Корабл: $name, Скорость: $speed км/ч, Вместимость: $capacity пассажиров")
    }
}