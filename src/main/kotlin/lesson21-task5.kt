package org.example

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}

fun main() {
    val skills = mapOf(
        "Сила" to 120,
        "Ловкость" to 150,
        "Интелект" to 150,
        "Выносливость" to 90
    )
    println("Лучший навык: ${skills.maxCategory()}")
}