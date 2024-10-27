package org.example

fun main() {

    println("Введите количество секунд:")
    val seconds = readln().toInt()

    var timer = seconds

    while (timer > 0) {
        println("Осталось секнуд: $timer")
        Thread.sleep(1000)
        timer--
    }
    println("Прошло $timer секнуд ")
}