package org.example.lesson_1

fun main() {

    val year = 1961

    var hour = 9
    var minute = 7

    println(year)
    println(String.format("%02d:%02d", hour, minute))

    hour = 10
    minute = 55

    println(String.format("%02d:%02d", hour, minute))

}