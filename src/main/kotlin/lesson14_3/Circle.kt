package org.example.lesson14_3

import kotlin.math.PI

class Circle(color: String, val radiues: Double) : Figure(color) {
    override fun calculateArea(): Double = PI * radiues * radiues

    override fun calculatePerimeter(): Double = 2 * PI * radiues
}