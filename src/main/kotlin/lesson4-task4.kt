package org.example

fun main () {

    val trainingDay = 5

    val armsDay = trainingDay % 2 !=0


    println("""
    Упражнения для рук: $armsDay     
    Упражнения для ног: ${!armsDay}      
    Упражнения для спины: ${!armsDay} 
    Упражнения для пресса: $armsDay
 """.trimIndent()
)

}