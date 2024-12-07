package org.example

open class Product(
    val name: String,
    val stock: Int
) {
    fun displayInfo() {
        println("Товар: $name, Количество на складе: $stock")
    }
}

interface Searchable {
    fun searchRelated()
}

    class Instrument(
        name: String,
        stock: Int
    ) : Product(name, stock), Searchable {
        override fun searchRelated() {
            println("Выполните поиск комплектующих для инструмента: $name")
        }
    }

    class Accessory(
        name: String,
        stock: Int
    ) : Product(name, stock)

    fun main() {

    val guitar = Instrument("Гитара", 5)
    val string = Accessory("Струны для гитары", 20)

    guitar.displayInfo()
    string.displayInfo()

    guitar.searchRelated()
}