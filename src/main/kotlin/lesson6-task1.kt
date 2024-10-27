package org.example

fun main() {

    println("Создайте логин:")
    val createLongin = readln()

    println("Создайте пароль:")
    val createPassword = readln()

    var login: String
    var password: String

    do {
        println("Введите логин:")
        login = readln()

        println("Введите пароль")
        password = readln()

        if (login != createLongin || password != createPassword) {
            println("Неверный логин или пароль, попробуйде еще раз")
        }

    }    while (login != createLongin || password != createPassword)
        println("Успешная авторизация")
}