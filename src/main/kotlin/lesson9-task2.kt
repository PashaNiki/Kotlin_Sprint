package org.example

fun main() {

    val ingredients = mutableListOf("мука" , "сыр", "томатная паста")

    println("В рецепте есть базовые ингридиенты: ${ingredients.joinToString(",")}}")

    println("Желаете добавить еще? (да/нет)")
    val userResponse = readln()

    if(userResponse.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()

        ingredients.add(newIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: ${ingredients.joinToString (",")} ")
    } else {
        println("Программа завершена")
    }
}