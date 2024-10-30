package org.example

fun main() {

    println("Введите количество секунд:")
    val seconds = readln().toInt()

    for (remainingSeconds in seconds downTo 1) {
        println("Осталось секунд: $remainingSeconds")
        Thread.sleep(1000)
    }
    println("Время вышло")
}