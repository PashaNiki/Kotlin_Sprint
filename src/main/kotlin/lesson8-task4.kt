package org.example

fun main() {

    val ingredients = arrayOf("мука", "томатная паста", "сыр", "соль", "ветчина", "базилик")

    println("Текущий список ингридинетов:")
    println(ingredients.joinToString (", "))

    println("Введите ингридиент который хотите заменить:")
    val oldIngredient = readln()

    if (oldIngredient in ingredients) {
        println("Введите новый ингридиент для замены:")
        val newIngredient = readln()

        val index = ingredients.indexOf(oldIngredient)
        ingredients[index] = newIngredient

        println("Готово! Вы сохранили следующий список:")
        println(ingredients.joinToString (", "))
    } else {
        println("Ингридиент \"$oldIngredient\" в списке не найден")
    }

}