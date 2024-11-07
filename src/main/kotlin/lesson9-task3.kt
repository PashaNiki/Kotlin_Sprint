package org.example

fun main() {

    val ingredientsPortion = listOf(2, 50, 15)

    println("Введите количество порций:")
    val portions = readln().toInt()

    val totalEggs = ingredientsPortion[0] * portions
    val totalMilk = ingredientsPortion[1] * portions
    val totalButter = ingredientsPortion[2] * portions

    println("На $portions порций вам нужно:")
    println("Яиц - $totalEggs шт.")
    println("Молока - $totalMilk мл.")
    println("Сливочного масла - $totalButter гр.")
}