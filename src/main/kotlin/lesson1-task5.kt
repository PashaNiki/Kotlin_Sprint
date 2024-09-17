package org.example

fun main() {
    val secondsInSpace = 6480

    val hours = secondsInSpace / 3600

    val minutes = (secondsInSpace % 3600) / 60

    val seconds = secondsInSpace % 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}