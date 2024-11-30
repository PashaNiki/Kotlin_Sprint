package org.example.lesson14_3

import kotlin.math.PI

abstract class Figure (val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(color: String, val radiues: Double) : Figure(color) {
    override fun calculateArea(): Double = PI * radiues * radiues

    override fun calculatePerimeter(): Double = 2 * PI * radiues
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun calculateArea(): Double = width * height

    override fun calculatePerimeter(): Double = 2 * (width + height)
}

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