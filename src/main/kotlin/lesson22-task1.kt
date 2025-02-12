package org.example

class RegularBook(
    val title: String,
    val author : String)

data class DataBook(
    val title: String,
    val author: String)

fun main() {
    val book1 = RegularBook("1984", "Джордж Оруэлл")
    val book2 = RegularBook("1984", "Джордж Оруэлл")

    val dataBook1 = DataBook("1984", "Джордж Оруэлл") // обычные классы сравниваются по ссылке на объект
    val dataBook2 = DataBook("1984", "Джордж Оруэлл") // data class сравнивает значение полей

    println("Сравнение RegularBook ${book1 == book2}") // обекты разные в памяти, поэтому сравнение false

    println("Сравнение DataBook ${book1 == book2}") // т.к поля одинаковые, объекты считаются равными true
}
