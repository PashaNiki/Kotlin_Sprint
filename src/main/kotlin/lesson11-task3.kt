package org.example

import java.io.ObjectInputFilter.Status

class User(
    val nickname: String,
    val avatar: String,
    var status: String = "микрофон выключен"
) {

    fun showInfo() {
        println("Пользователь: $nickname")
        println("Аватар: $avatar")
        println("Статус: $status")

    }
}

class Room(
    val cover: String,
    val name: String,

) {
    private val participants = mutableListOf<User>()

    fun addParticipant(user: User) {
        participants.add(user)
        println("Пользователь ${user.nickname} добавлен в команту \"$name\".")
    }

    fun updateStatus(nickname: String, newStatus: String) {
        val user = participants.find { it.nickname == nickname }
        if (user != null) {
            user.status = newStatus
            println("Статус пользователя $nickname обновлен на \"$newStatus\".")
        } else {
            println("Пользовтаель с ником $nickname не найден в команте.")
        }
    }

    fun showParticipants() {
        println("Участник в команте \"$name\":")
        for (user in participants) {
            println("- ${user.nickname} (Статус: ${user.status})")
        }
    }

}

fun main() {

    val room = Room(
        cover = "cover_image.jpg",
        name = "Общение по интересам"
    )

    val user1 = User(nickname = "Alex", avatar = "alex_avatar.png")
    val user2 = User(nickname = "Taco777", avatar = "Taco777_avatar.png", status = "разговаривает")

    room.addParticipant(user1)
    room.addParticipant(user2)

    room.updateStatus("Alex", "пользователь заглушен")

    room.showParticipants()
}