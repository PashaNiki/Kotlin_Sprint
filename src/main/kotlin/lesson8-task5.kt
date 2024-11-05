package org.example

fun main() {

    println("Сколько ингредиентов добавить?")
    val ingredientsAll = readln().toInt()

    val ingredients = Array(ingredientsAll) {""}

    for (i in ingredients.indices) {
        println("Введите ингредиент ${i + 1}:")
        ingredients[i] = readln()
    }
    println("Вы ввели следующие игредиенты:")
    println(ingredients.joinToString (", "  ))
}