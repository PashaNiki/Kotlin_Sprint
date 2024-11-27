package org.example

class phoneContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printInfo() {
        val companyInfo = company?: "<не указано>"
        println("Имя: $name, Номер: $phoneNumber, Компания: $companyInfo")
    }
}

fun main() {
    val phoneBook = listOf(
        phoneContact(name = "Ростислав", phoneNumber = 89123456789, company = "Reddit"),
        phoneContact(name = "Александр", phoneNumber = 89003451111),
        phoneContact(name = "Мария", phoneNumber = 89037676789, company = null),
        phoneContact(name = "Олег", phoneNumber = 89120056789, company = "null"),
        phoneContact(name = "Вячеслав", phoneNumber = 89122226789, company = "Google"),
    )
    println("Все контакты:")
    phoneBook.forEach { it.printInfo() }

    val companies = phoneBook.mapNotNull { it.company }.toSet()
    println("Спосок компаний в телефонной книге:")
    companies.forEach { println(it) }
}