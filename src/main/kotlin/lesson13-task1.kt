package org.example

class phoneBookEntry(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printInfo() {
        val companyInfo = company ?: "Компания не указана"
        println("Имя: $name")
        println("Номер телефона: $phoneNumber")
        println("Компания: $companyInfo")
    }
}

fun main() {
    val entry1 = phoneBookEntry(name = "Иван Губеров", phoneNumber = 79120012348, company = "BeeLine")
    val entry2 = phoneBookEntry(name = "Мария Соколова", phoneNumber = 79630044378, company = "MTS")

    println("Контакт 1:")
    entry1.printInfo()

    println("Контакт 2:")
    entry2.printInfo()
}