package org.example

class User2 (
    val id: String,
    val login: String,
    var password: String,
    var email: String,
    var bio: String = ""
) {

    fun printUserInfo() {
        println("ID: $id")
        println("Login: $login")
        println("Email: $email")
        println("Bio: $bio")
    }

    fun updateBio() {
        println("Введите информацию о себе:")
        val inputBio = readln()
        bio = inputBio
        println("Информация обновлена.")
    }

    fun changePasswoed() {
        println("Введите теущий пароль:")
        val currentPassword = readln()
        if(currentPassword == password) {
            println("Введите новый пароль:")
            val newPassword = readln()
            password = newPassword
            println("Пароль успешно изменен.")
        } else {
            println("Неверный текущий пароль. Пароль не изменен.")
        }
    }
}

fun main() {

    val user = User2(
        id = "1",
        login = "user123",
        password = "oldPassword",
        email = "user@example.com"
    )

    println("Информация о пользователе:")
    user.printUserInfo()
    println()

    user.updateBio()
    println()

    user.changePasswoed()
    println()

    println("Обновленная информация о пользователе:")
    user.printUserInfo()
}