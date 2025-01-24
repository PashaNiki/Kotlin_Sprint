package org.example

fun main() {
    val greeting: (String) -> String = { username: String ->
        "С Наступающим Новым Годом, $username!"
    }

    val username = "Оля"

    val message = greeting(username)

    println(message)
}