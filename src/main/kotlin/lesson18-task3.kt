package org.example

abstract class Pet(val name: String) {
    abstract fun eat()
    fun sleep() {
        println("$name -> спит")
    }
}
class Fox(name: String): Pet(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}
class Dog(name: String) : Pet(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}
class Cat(name: String) : Pet(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}
    fun main() {
        val fox = Fox("Лиса")
        val dog = Dog("Собака")
        val cat = Cat("Кошка")
        val pets: List<Pet> = listOf(fox, dog, cat)

        for (pet in pets) {
            pet.eat()
        }
    }