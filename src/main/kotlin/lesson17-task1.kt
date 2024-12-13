package org.example

class QuizItem(
    var question: String,
    var answer: String
)
    fun main() {
        val quizItem = QuizItem("Первый человек в космосе?", "Юрий Гагарин")

        println("Вопрос: ${quizItem.question}")

        println("Ответ: ${quizItem.answer}")

        quizItem.answer = "Нил Армстронг"

        println("Новый ответ: ${quizItem.answer}")
    }