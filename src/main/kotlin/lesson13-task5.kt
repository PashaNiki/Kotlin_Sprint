package org.example

class saveContact(
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
    println("Введие данные для нового контакта:")

    try {
        println("Введите имя: ")
        val name = readLine()?.takeIf { it.isNotBlank() } ?: throw IllegalArgumentException("Имя не может быть пустым.")

        println("Введите номер телефона: ")
        val phoneInput = readLine()
        val phoneNumber = phoneInput?.toLong() ?: throw IllegalArgumentException("Номер телефона не может быть пустым.")

        println("Введите команию (или оставьте пустым): ")
        val companyInput = readLine()
        val company = companyInput?.takeIf { it.isNotBlank() }

        val contact = saveContact(name = name, phoneNumber = phoneNumber, company = company)
        println("Контакт успешно создан:")
        contact.printInfo()

    } catch (e: NumberFormatException) {
        println("Ошибка: введено некорректное значение для номера телефона.")
        println("Исключение: ${e::class.simpleName}")
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
        println("Исключение: ${e::class.simpleName}")
    }
}