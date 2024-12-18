package org.example

class Order(private val orederNumber: Int) {
    private var status: String = "Не готов"

    fun getStatus(): String {
        return status
    }

    private fun updateStatus(newStatus: String) {
        status = newStatus
    }

    fun requestStatusChange(newStatus: String) {
        println("Заявка отправлена менеджеру. Меняем статус заказа")
        updateStatus(newStatus)
    }

    fun getOrderNumber(): Int {
        return orederNumber
    }

    fun main() {
        val order = Order(12345)

        println("Номер заказа: ${order.getOrderNumber()}")
        println("Текущий статус: ${order.getStatus()}")

        order.requestStatusChange("В обработке")
        println("Текущий статус: ${order.getStatus()}")

        order.requestStatusChange("Готов к выдаче")
        println("Текущий статус: ${order.getStatus()}")
    }
}

