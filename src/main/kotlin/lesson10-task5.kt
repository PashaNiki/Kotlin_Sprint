package org.example

const val VALID_USER_LOGIN = "asd123"
const val VALID_USER_PASSWORD = "qwerty123"

val numbers = '0'..'9'
val symbolsLower = 'a'..'z'
val symbolUpper = 'A'..'Z'

fun generateToken(): String {

    val token = StringBuilder()
    for (i in 1..32) {
        val char = when ((1..3).random()) {
            1 -> numbers.random()
            2 -> symbolUpper.random()
            3 -> symbolsLower.random()
            else -> ' '
        }
        token.append(char)
    }
    return token.toString()
}

fun authorize (login: String, password: String): String? {
    return if (login == VALID_USER_LOGIN && password == VALID_USER_PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun getCart(token: String?): List<String>? {
    val card = listOf("Товар 1, Товар 2, Товар 3")
    return if (token != null) card else null
}

fun main() {
    println("Введите логин")
    var login = readln()
    println("Введите пароль")
    val password = readln()

    val token = authorize(login, password)
    if (token != null) {
        println("Успешная авторизация. Ваш токен доступа: $token")
    val card = getCart(token)
    println("Содержимое вашей корзины: ${card?.joinToString(", ")}")
    } else {
        println("Неудачная авторизация, проверье логн или пароль")
    }
}