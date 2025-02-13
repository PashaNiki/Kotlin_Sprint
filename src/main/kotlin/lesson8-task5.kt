package org.example

fun main() {

    println("Сколько ингредиентов добавить?")
    val ingredients = Array(readln().toInt()) {
        println("Ввелите ингредиент ${it + 1}:")
        readln()
    }
    println("Вы ввели следующие ингредиенты:")
    println(ingredients.joinToString (", "))
}