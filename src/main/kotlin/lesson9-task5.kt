package org.example

fun main() {

    val ingredients = mutableSetOf<String>()

    repeat(5) {
        println("Введите название ингридиента:")
        val input = readln().trim()
        ingredients.add(input)
    }

    val sortIngredients = ingredients.toList().sorted()

    val formattedIngredients = sortIngredients.mapIndexed { index, ingredient ->
        if (index == 0) ingredient.replaceFirstChar { it.uppercase() } else ingredient
    }
    println("Ингредиенты в алфавитном порядке:")
    println(formattedIngredients.joinToString (", "))

}