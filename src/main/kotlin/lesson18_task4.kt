package org.example

private const val MULTIPLIER = 2
private const val NUM_FACES_CUBE = 6

abstract class Box {
    abstract fun surfaceArea(): Double
}

class RectangularBox(
    private val length: Double,
    private val width: Double,
    private val height: Double
) : Box() {
    override fun surfaceArea(): Double {
        return MULTIPLIER * (length * width + length * height + width * height)
    }
}
class Cube(
    private val edgeLenght: Double
) : Box() {
    override fun surfaceArea(): Double {
        return NUM_FACES_CUBE * edgeLenght * edgeLenght
    }
}

fun main() {

    val rectangularLength = 2.0
    val rectangularWidth = 3.0
    val rectangularHeight = 4.0
    val cubeEdge = 3.0

    val rectangularBox = RectangularBox(
        length = rectangularLength,
        width = rectangularWidth,
        height = rectangularHeight
    )
    val cube = Cube(
        edgeLenght = cubeEdge
    )
    println("Площадь поверхности прямоугольного ящика: ${rectangularBox.surfaceArea()}")
    println("Площадь поверхности куба: ${cube.surfaceArea()}")

    val boxes: List<Box> = listOf(rectangularBox, cube)
    for (box in boxes)
        println("Площадь поверхности: ${box.surfaceArea()}")
}