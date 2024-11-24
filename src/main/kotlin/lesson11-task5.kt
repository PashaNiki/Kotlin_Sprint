package org.example

class ForumMember(
    val userId: String,
    val userName: String
)

class ForumMessage(
    val authorId: String,
    val message: String
)

class Forum {
    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()
    private var userIdCounter = 1

    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(
            userId = userIdCounter.toString(),
            userName = userName
        )
        members.add(newUser)
        userIdCounter++
        println("Новый пользователь создан: ${newUser.userName} (ID: ${newUser.userId})")
        return newUser
    }
    fun createNewMessage(userId: String, message: String) {
        val user = members.find { it.userId == userId }
        if (user != null) {
            val newMessage = ForumMessage(
                authorId = userId,
                message = message
            )
            messages.add(newMessage)
            println("Сообщение добавлено: \"${user.userName}: $message\"")
        } else {
            println("Пользователь с ID $userId не найден. Сообщение не добавлено.")
        }
    }

    fun printThread() {
        println("Сообщение на форуме:")
        messages.forEach { message ->
            val authorName = members.find { it.userId == message.authorId }?.userName ?: "Неизвестный автор"
            println("$authorName: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Max")
    val user2 = forum.createNewUser("Billy")

    forum.createNewMessage(user1.userId, "Привет! Как дела?")
    forum.createNewMessage(user1.userId, "Как настроение?")
    forum.createNewMessage(user2.userId,"Привет, Max, все отлично! Как ты?")
    forum.createNewMessage(user2.userId, "Настроение супер! Хочешь обсудить рецепты?")

    forum.printThread()
}