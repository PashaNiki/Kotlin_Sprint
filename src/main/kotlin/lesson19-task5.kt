package org.example

import java.util.Scanner

enum class Gender(val displayName: String) {
    MALE("Мужской"),
    FEMALE("Женский");
}

fun parseGender(input: String): Gender? {
    return Gender.values().find { it.name.equals(input, ignoreCase = true) }
}
data class Person(val name: String, val gender: Gender) {
    override fun toString(): String {
        return "Имя: $name, Пол: ${gender.displayName}"
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val people = mutableListOf<Person>()

    println("Добро пожаловать в приложение 'Картотека'.")
    println("Введите данные человека в формате: Имя Пол")
    println("Пол должен быть: MALE (Мужской) или FEMALE (Женский)")
    println("Пример ввода: Иван MALE")

    repeat(5) {
        println("Введите данные человка: ")
        val input = scanner.nextLine().split(" ")

        if (input.size == 2) {
            val name = input[0]
            val genderInput = input[1]
            val gender = parseGender(genderInput)

            if (gender != null) {
                people.add(Person(name, gender))
            } else {
                println("Ошибка: Пол должен быть MALE или FEMALE. Повторите ввод.")
            }
        } else {
            println("Ошибка: Введите данные в формате: Имя Пол")
        }
    }
    println("\nСписок людей в картотеке:")
    for (person in people) {
        println(person)
    }
}