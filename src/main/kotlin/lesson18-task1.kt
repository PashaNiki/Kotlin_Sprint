package org.example

class Order(
    val orderNumber: String
) {
    fun displayOrderInfo(item: String) {
        println("Заказан товар: $item")
    }
    fun displayOrderInfo(items: List<String>) {
        println("Заказаны следующие товары: ${items.joinToString(", ")}")
    }
}

fun main() {
    val singleItemOrder = Order("1234")
    singleItemOrder.displayOrderInfo("Книга")

    val multipleItemsOrder = Order("92992")
    multipleItemsOrder.displayOrderInfo(listOf("Планешет", "Чехол"))
}