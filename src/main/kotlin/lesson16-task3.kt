package org.example

class User(private val login: String, private val password: String) {

    fun validatePassword(inputPassword: String): Boolean = inputPassword == password

    fun getLogin(): String {
        return login
    }
}

fun main() {
    val user = User("user123", "securePassword")

    val isPasswordCorrect = user.validatePassword("securePassword")
    println("Пароль верный: $isPasswordCorrect")

    val isPasswordInCorrect = user.validatePassword("wrongPassword")
    println("Пароль верный: $isPasswordCorrect")
}