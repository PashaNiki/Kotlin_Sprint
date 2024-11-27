package org.example

class contactEntry(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printInfo() {
        val companyInfo = company ?: "<не указано>"
        println("Имя: $name, Номер: $phoneNumber, Компания: $companyInfo")
    }
}

fun main() {
    val contact1 = contactEntry(name = "Ростислав", phoneNumber = 89123456789, company = "Reddit")
    val contact2 = contactEntry(name = "Алексей", phoneNumber = 89003456329)

    contact1.printInfo()
    contact2.printInfo()
}