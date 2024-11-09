package org.example

fun main() {

    val ingredientsPortion = listOf(2, 50, 15)
    val ingredientsNames = listOf("Яиц", "Молока", "Сливочного масла")

    println("Введите количество порций:")
    val input = readlnOrNull()

    val portions = input?.toIntOrNull()
    if (portions == null || portions <= 0) {
        println("Пожалуйста, введите корректное положительное число.")
        return
    }

    val totalIngredients = ingredientsPortion.map { it * portions }

    println("На $portions порций вам нужно:")
    ingredientsNames.forEachIndexed { index, name ->
        val unit = if (index == 0) "шт." else if (index == 1) "мл." else "гр."
        println("$name - ${totalIngredients[index]} $unit")

    }
}