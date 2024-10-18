package org.example

fun main () {

    val trainingDay = 5

    val armsDay = trainingDay % 2 !=0
    val legsDay = !armsDay
    val backDay = legsDay
    val absDay = armsDay

    println("""
    Упражнения для рук: $armsDay     
    Упражнения для ног: $legsDay      
    Упражнения для спины: $backDay 
    Упражнения для пресса: $absDay
 """.trimIndent()
)

}