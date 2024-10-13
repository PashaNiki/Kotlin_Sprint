package org.example

    const val SECONDS_IN_MINUTE = 60

fun main() {

    val secondsInSpace = 6480

    val In_Hour = SECONDS_IN_MINUTE * SECONDS_IN_MINUTE

    val hours = secondsInSpace / In_Hour
    val minutes = (secondsInSpace % In_Hour) / SECONDS_IN_MINUTE
    val seconds = secondsInSpace % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}