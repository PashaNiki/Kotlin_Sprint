package org.example

fun main() {

    println("Введите число:")
    val userNumber = readln().toInt()

    for (i in 0..userNumber step 2){
        println(i)
    }

}