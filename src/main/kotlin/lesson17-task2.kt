package org.example

private const val DEFAULT_AVERAGE_SPEED = 22.0
private const val UPDATED_AVERAGE_SPEED = 25.0
private const val DEFAULT_HOME_PORT = "Sydnay"
private const val UPDATED_HOME_PORT = "Cape Town"

    class Ship(name: String, var averageSpeed: Double, var homePort: String) {

        var name: String = name
            set(value) {
                println("Измененеие имени запрещено. Текущее имя: $field")
            }

        fun displayInfo() {
            println("Имя корабля: $name, Средняя скорость: $averageSpeed узлов, Порт приписки: $homePort")
        }
    }

    fun main() {
        val ship = Ship("Starfish", DEFAULT_AVERAGE_SPEED, DEFAULT_HOME_PORT)

        ship.displayInfo()

        ship.averageSpeed = UPDATED_AVERAGE_SPEED
        ship.homePort = UPDATED_HOME_PORT

        ship.displayInfo()

        ship.name = "Sea horse"
    }