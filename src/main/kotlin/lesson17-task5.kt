package org.example

class User(
    login: String,
    password: String
) {
    var login: String = login
        get() = field
        set(value) {
            field = value
            println("Логин успешно изменен на: $value")
        }
    var password: String = password
        get() = "*".repeat(field.length)
        set(_) {
            println("Вы не можете изменить пароль.")
        }
}
    fun main() {
        val user = User("User123", "securePassword")

        println("Текуищй логин: ")

        user.login = "newUser22"

        println("Пароль: ${user.password}")

        user.password = "newPassword"
    }