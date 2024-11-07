package org.example

fun main() {

    println("Введите 5 ингредиентов блюда, разделенные запятой и пробелом")
    val userInput = readln()

    val ingredients = userInput.split(", ").toList()

    val sortedIngredients = ingredients.sorted()

    println("Ингриденты в алфавитном порядке:")
    println(sortedIngredients.joinToString (", "))

}