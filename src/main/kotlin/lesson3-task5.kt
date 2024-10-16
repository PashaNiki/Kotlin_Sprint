package org.example

fun main(){

    val moveD = "D2-D4;0"

    val parts = moveD.split(";","-")
    val from = parts[0]
    val to = parts[1]
    val moveNumber = parts[2]

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")
}