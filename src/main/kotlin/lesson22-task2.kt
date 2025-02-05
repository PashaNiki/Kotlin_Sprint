package org.example

import javax.xml.crypto.Data

class RegularBook2(
    val title: String,
    val author: String
)

data class DataBook2(
    val title: String,
    val author: String
)

fun main() {
    val regularBook = RegularBook2("1984", "Джордж Оруэлл")
    val dataBook = DataBook2("1984", "Джордж Оруэлл")

    println("Обычный класс: $regularBook") // обычный класс не определяет toString(), выводя ссылку
    println("Data-класс: $dataBook") // автоматически генерирует toString()
}