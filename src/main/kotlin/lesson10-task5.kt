package org.example

const val VALID_USER_LOGIN = "asd123"
const val VALID_USER_PASSWORD = "qwerty123"

fun generateToken(): String {

    val token = StringBuilder()
    for (i in 1..32) {
        val char = when ((1..3).random()) {
            1 -> (48..57).random().toChar()
            2 -> (65..90).random().toChar()
            3 -> (97..122).random().toChar()
            else -> ' '
        }
        token.append(char)
    }
    return token.toString()
}

fun authorizate (login: String, password: String): String? {
    return if (login == VALID_USER_LOGIN && password == VALID_USER_PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun getCard(token: String?): List<String>? {
    val card = listOf("Товар 1, Товар 2, Товар 3")
    return if (token != null) card else null
}

fun main() {
    println("Введите логин")
    var login = readln()
    println("Введите пароль")
    val password = readln()

    val token = authorizate(login, password)
    if (token != null) {
        println("Успешная авторизация. Ваш токен доступа: $token")
    val card = getCard(token)
    println("Содержимое вашей корзины: ${card?.joinToString(", ")}")
    } else {
        println("Неудачная авторизация, проверье логн или пароль")
    }
}