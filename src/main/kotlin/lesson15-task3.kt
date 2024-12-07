package org.example

abstract class ForumUser(val username: String, val role: String) {
    fun readForum() {
        println("$username читает форум")
    }

    fun writeMessage(message: String) {
        println("$username пишет сообщение: \"$message\"")
    }

    abstract fun displayRole()
}

class RegularUser(username: String) : ForumUser(username, "Обычный пользователь") {
    override fun displayRole() {
        println("$username - $role")
    }
}

class Admin(username: String) : ForumUser(username, "Администратор") {
    override fun displayRole() {
        println("$username - $role")
    }

    fun deleteMessage(messageId : Int) {
        println("$username удаляет сообщение с ID: $messageId")
    }

    fun deleteUser(user: ForumUser) {
        println("$username удаляет пользователя: ${user.username}")
    }
}

    fun main() {
        val user = RegularUser("Ваня")
        val admin = Admin("Олег")

        user.displayRole()
        user.readForum()
        user.writeMessage("Всем привет")

        admin.displayRole()
        admin.readForum()
        admin.writeMessage("Добрый день, форумчане!")
        admin.deleteMessage(42)
        admin.deleteUser(user)
    }