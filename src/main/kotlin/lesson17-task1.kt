package org.example

class QuizItem(question: String, answer: String) {
    var question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
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