package org.example

fun main() {

    var from = "E2"
    var to = "E4"
    var moveNum = 1

    var move = "$from-$to;$moveNum"
    println(move)

    from = "D2"
    to = "D4"
    moveNum = 2

    move= "$from-$to;$moveNum"
    println(move)
}