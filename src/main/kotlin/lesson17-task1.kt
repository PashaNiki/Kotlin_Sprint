package org.example

class QuizItem(question: String, answer: String) {

    var question: String = question
        get() {
            println("Получение вопроса: $field")
            return field
        }
    var answer: String = answer
        get() {
            println("Получение ответа: $field")
            return field
        }
        set(value) {
            println("Установка нового ответа: $value")
            field = value
        }
}

    fun main() {
        val quizItem = QuizItem("Первый человек в космосе?", "Юрий Гагарин")

        println("Вопрос: ${quizItem.question}")

        println("Ответ: ${quizItem.answer}")

        quizItem.answer = "Нил Армстронг"

        println("Новый ответ: ${quizItem.answer}")
    }