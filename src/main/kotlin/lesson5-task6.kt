package org.example

fun main() {
    println("Введите ваш вес (кг): ")
    val weight = readln().toDoubleOrNull() ?: return println("Ошибка: Введите корректный вес")

    println("Введите ваш рост (см): ")
    val heightCm = readln().toDoubleOrNull() ?: return println("Ошибка: Введите корректный рост")

    val heightM = heightCm / 100

    val bmi = weight / (heightM * heightM)

    val category = when {
        bmi < 18.5 -> "Недостаточная масса тела"
        bmi < 25.0 -> "Нормальная масса тела"
        bmi < 30.0 -> "Избыточкая масса тела"
        else -> "Ожирение"
    }
    println("Ваш ИМТ: %.2f".format(bmi))
    println("Категория: $category")
}