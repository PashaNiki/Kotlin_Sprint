package org.example

class Spaceship {
    fun takeOff() {
        println("Космический корабль взлетает")
    }

    fun land() {
        TODO("Логика посадки пока не реализована. Нужны дополнительные требования")
    }

    fun shootAsteroid(): Nothing {
        throw NotImplementedError("Этот метод не реализован. Космический корабль пока не может стрелять астероидами")
    }

    fun main() {
        val spaceship = Spaceship()
        spaceship.takeOff()

        try {
            spaceship.land()
        } catch (e: NotImplementedError) {
            println("Пойманное исключение: ${e.message}")
        }
        try {
            spaceship.shootAsteroid()
        } catch (e: NotImplementedError) {
            println("Пойманное исключение: ${e.message}")
        }
    }
}