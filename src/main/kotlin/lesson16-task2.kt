package org.example

import kotlin.math.pow

private const val PI = 3.14

class Circle(private val radius: Double) {

    fun calculateCircumference(): Double {
        return 2 * PI * radius
    }

    fun calculateArea(): Double {
        return PI * radius.pow(2.0)
    }
}

fun main() {
    val circle = Circle(5.0)

    println("Длинна окружности: ${circle.calculateCircumference()}")
    println("Площадь круга: ${circle.calculateArea()}")
}