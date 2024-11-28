package org.example

fun main() {

    val num1 = (1..10).random()
    val num2 = (1..10).random()

    println("Подвердите, что вы черовек. Решите задачу: $num1 + $num2")

    val answer = readln()!!.toInt()

    if(answer == num1 + num2){
        println("Вход разрешен")
    } else {
        println("Вход запрещен")
    }
}