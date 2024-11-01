package org.example

fun main() {

    val ingredients = arrayOf("мука", "томатная паста", "сыр", "соль", "ветчина", "базилик")

    println("Введите ингридиент для поиска:")
    val userIngredient = readln()

    var isfound = false

    for (ingredient in ingredients) {
        if (ingredient.equals(userIngredient, ignoreCase = true)) {
            println("Ингридиент \"$userIngredient\" в рецепте есть")
            isfound = true
            break
        }
    }

    if (!isfound) {
        println("Такого ингридиента в рецепте нет")
    }

}