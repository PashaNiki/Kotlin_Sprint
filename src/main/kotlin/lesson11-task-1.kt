package org.example

class User (
    val id: String,
    val login: String,
    val password: String,
    var email: String
)

fun main () {

    val user1 = User(
        id = "1",
        login = "user_one",
        password = "password123",
        email = "user_one@example.com"
    )

    val user2 = User(
        id = "2",
        login = "user_two",
        password = "securepass456",
        email = "user_two@example.com"
    )

    println("Useer 1:")
    println("ID: ${user1.id}")
    println("Login: ${user1.login}")
    println("Password: ${user1.password}")
    println("Email: ${user1.email}")
    println()
    
    println("User 2:")
    println("ID: ${user2.id}")
    println("Login: ${user2.login}")
    println("Password: ${user2.password}")
    println("Email: ${user2.email}")
    }