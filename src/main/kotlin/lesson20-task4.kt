package org.example

fun main() {

    val elements = listOf("Кнопка", "Меню", "Ссылка", "Поле ввода", "Чекбокс")

    val actions = elements.map { element ->
        { println("Нажат элемент $element") }
    }

    for (index in actions.indices) {
        if ((index + 1) % 2 == 0) {
            actions[index]()
        }
    }
}
