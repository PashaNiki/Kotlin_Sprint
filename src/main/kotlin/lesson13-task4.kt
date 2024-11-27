package org.example

class Contact(
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
        val phoneBook = mutableListOf<Contact>()
        while (true) {

            println("Введите данные для нового контакта (или оставтье пустым для завершения):")

            println("Введите имя:")
            val name = readLine()?.takeIf { it.isNotBlank() } ?: break

            println("Введите номер телефона:")

            val phoneInput = readLine()
            val phoneNumber = phoneInput?.toLongOrNull()

            if (phoneNumber == null) {
                println("Ошибка: номер телефона введен некорректно или отсутствует. Контакт не будет добавлен.")
                continue
            }

            println("Введите команию (или оставтье пустым): ")
            val companyInput = readLine()
            val company = companyInput?.takeIf { it.isNotBlank() }

            phoneBook.add(Contact(name = name, phoneNumber = phoneNumber, company = company))
            println("Контакт добавлен успешно")
        }

        println("Список контактов:")
        phoneBook.forEach { it.printInfo() }
    }