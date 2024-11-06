package org.example

fun main() {

    val ingredients = listOf("мука", "томатная паста", "сыр", "соль", "ветчина", "базилик")

    println("В рецепте есть следующие ингредиенты: ${ingredients.joinToString(", ")}")

    println("Ингредиаенты по отдельности:")
    ingredients.forEach { ingredients ->
        println(ingredients)
    }

}