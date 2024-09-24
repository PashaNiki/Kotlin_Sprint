package org.example

fun main() {

    var allStudents = 4

    var scores = listOf(3, 4, 3, 5)
    val average = scores.sum().toDouble() / allStudents

    println(String.format("%.2f", average))
}