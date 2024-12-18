package org.example

class Package(val trackingNumber: String) {
    private var movementCounter: Int = 0

    var location: String = "Начальный пункт"
        set(value) {
            field = value
            movementCounter++
            println("Местоположение изменено на: $value")
        }

    fun displayInfo() {
        println("Номер посылки: $trackingNumber")
        println("Текущее местоположение: $location")
        println("Количестов перемещений: $movementCounter")
    }
}

fun main() {
    val package1 = Package("PK98111223")

    package1.displayInfo()

    package1.location = "Таможенное оформление"
    package1.location = "Сортировочный центр"
    package1.location = "Склад в городе получателя"
    package1.location = "Пункт выдачи"

    package1.displayInfo()
}