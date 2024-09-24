package org.example

fun main() {

    var secondsInSpace = 6480

    var Seconds_In_Minute = 60
    var In_Hour = Seconds_In_Minute * 60

    var hours = secondsInSpace / In_Hour
    var minutes = (secondsInSpace % In_Hour) / Seconds_In_Minute
    var seconds = secondsInSpace % Seconds_In_Minute

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}