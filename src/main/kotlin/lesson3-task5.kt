package org.example

fun main(){

    val moveD = "D2-D4;0"

    val parts = moveD.split(";")
    val movePart = parts[0]
    val moveNumber = parts[1]

    val moveDetail = movePart.split("-")
    val from = moveDetail[0]
    val to = moveDetail[1]

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")
}