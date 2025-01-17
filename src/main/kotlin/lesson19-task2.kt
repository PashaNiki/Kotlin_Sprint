package org.example

enum class Category(private val displayName: String) {
    CLOTHING("Одежда"),
    STATIONERY("Канцелярские товары"),
    MISC("Равзное");

    fun getDisplayName(): String {
        return displayName
    }
}

class Product(
    private val name: String,
    private val id: Int,
    private val category: Category
) {
    fun printInfo() {
        println("Товар: $name")
        println("ID: $id")
        println("Категория: ${category.getDisplayName()}")
    }
}

fun main() {
    val shirt = Product("Футболка", 101, Category.CLOTHING)
    val notebook = Product("Тетрадь", 102, Category.STATIONERY)
    val mug = Product("Кружка", 103, Category.MISC)

    shirt.printInfo()
    println()
    notebook.printInfo()
    println()
    mug.printInfo()
}