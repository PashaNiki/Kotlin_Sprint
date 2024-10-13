package org.example

fun main()  {

    val userName = "Александр"
    var greeting: String

    greeting = "Добрый день, $userName"
    println(greeting)

    greeting = "Добрый вечер, $userName!"
    println(greeting)

    greeting = "Добрый ночи, $userName!"
    println(greeting)
}