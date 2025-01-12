package org.example

const val NUM_FACES_CUBE = 6

class Screen {
    fun drawDot(x: Int, y: Int): String {
        return "Точка, нарисованная в координатах (Int): ($x, $y)"
    }
    fun drawDot(x: Float, y: Float): String {
        return "Точка, нарисованная в координатах (Float): ($x, $y)"
    }
    fun drawCircle(x: Int, y: Int, radius: Int): String {
        return "Круг, нарисованный с центром (Int): ($x, $y) и радиусом $radius"
    }
    fun drawCircle(x: Float, y: Float, radius: Float): String {
        return "Круг, нарисованный с центром (Float): ($x, $y) и радиусом $radius"
    }
    fun drawSquare(x: Int, y: Int, sideLength: Int): String {
        return "Квадрат, нарисованный с верхним левым углом (Int): ($x, $y) и длиной стороны $sideLength"
    }
    fun drawSquare(x: Float, y: Float, sideLength: Float): String {
        return "Квадрат, нарисованный с верхним левым углом (Float): ($x, $y) и длиной стороны $sideLength"
    }
}

fun main() {
    val pointXInt = 10
    val pointYInt = 20
    val pointXFloat = 10.5f
    val pointYFloat = 20.5f

    val circleXInt = 30
    val circleYInt = 40
    val circleRadiusInt = 15
    val circleXFloat = 30.5f
    val circleYFloat = 40.5f
    val circleRadiusFloat = 15.5f

    val squareXInt = 50
    val squareYInt = 60
    val squareSideLengthInt = 25
    val squareXFloat = 50.5f
    val squareYFloat = 60.5f
    val squareSideLengthFloat = 25.5f

    val screen = Screen()

    println(screen.drawDot(pointXInt, pointYInt))
    println(screen.drawDot(pointXFloat, pointYFloat))

    println(screen.drawCircle(circleXInt, circleYInt, circleRadiusInt))
    println(screen.drawCircle(circleXFloat, circleYFloat, circleRadiusFloat))

    println(screen.drawSquare(squareXInt, squareYInt, squareSideLengthInt))
    println(screen.drawSquare(squareXFloat, squareYFloat, squareSideLengthFloat))
}

