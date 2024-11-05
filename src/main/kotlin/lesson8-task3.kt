package org.example

fun main() {

    val ingredients = arrayOf("мука", "томатная паста", "сыр", "соль", "ветчина", "базилик")

    println("Введите ингридиент для поиска:")
    val userIngredient = readln()

        if (userIngredient.lowercase() in ingredients.map { it.lowercase() } ) {
            println("Ингридиент \"$userIngredient\" в рецепте есть")
        } else {
            println("Такого ингридиента в рецепте нет")
    }
}