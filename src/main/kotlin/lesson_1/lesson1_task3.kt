package org.example.lesson_1

fun main() {

    val year = 1961

    var hour : String = "09"
    var minute :  String = "07"

    println(year)
    println("""09:07""")
//   println(String.format("%02d:%02d", hour, minute))

    hour = "10"
    minute = "55"
    println("10:55")
//    println(String.format("%02d:%02d", hour, minute))

}