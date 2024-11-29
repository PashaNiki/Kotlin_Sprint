package org.example.lesson14_3

fun main() {
    val figures = listOf(
        Circle("black", 5.0),
        Circle("white", 3.0),
        Rectangle("black", 4.0,6.0),
        Rectangle("white", 2.0,3.0)
    )

    val blackPerimetrsSum = figures
        .filter { it.color == "black" }
        .sumOf { it.calculatePerimeter() }

    val whiteAreasSum = figures
        .filter { it.color == "white" }
        .sumOf { it.calculateArea() }

    println("Сумма периметров всех черных фигур: %.2f".format(blackPerimetrsSum))
    println("Сумма площадей всех белых фируг: %.2f".format(whiteAreasSum))
}