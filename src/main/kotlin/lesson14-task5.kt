package org.example

open class Message(
    val id: Int,
    val author: String,
    val text: String
) {
    open fun display(indent: String = "") {
        println("$indent$author: $text")
    }
}

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int
) : Message(id, author, text) {
    override fun display(indent: String) {
        super.display("\t$indent")
    }
}

class Chat {
    private val messages = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(author: String, text: String) {
        val message = Message(nextId++, author, text)
        messages.add(message)
    }

    fun addThreadMessage(parentMessageId: Int, author: String, text: String) {
        val parentExists = messages.any { it.id == parentMessageId }
        if (!parentExists) {
            println("Ошибка: родительское сообщение с ID $parentMessageId не найдено")
            return
        }
        val childMessage = ChildMessage(nextId++, author, text, parentMessageId)
        messages.add(childMessage)
    }

    fun printChat() {

        val groupedMessages = messages.groupBy {
            if (it is ChildMessage) it.parentMessageId else it.id
        }

        for ((parentId, group) in groupedMessages) {
            val parent = messages.find { it.id == parentId }
            parent?.display()
            group.filterIsInstance<ChildMessage>().forEach { it.display("\t") }
        }
    }
}

fun main() {
    val chat = Chat()

    chat.addMessage("Ваня", "Всем привет!")
    chat.addMessage("Петя", "Добрый день.")

    chat.addThreadMessage(1, "Петя", "Привет! как дела?")
    chat.addThreadMessage(2, "Алена", "Давно тебя не было!")
    chat.addThreadMessage(3, "Олег", "Привет! Привет!")

    chat.printChat()
}