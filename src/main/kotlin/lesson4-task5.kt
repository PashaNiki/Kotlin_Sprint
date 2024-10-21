package org.example

    const val MIN_TEAM = 55
    const val MAX_TEAM = 70
    const val MIN_PROVISION_BOX = 50


fun main() {

    println("Корабль имеет повреждения? (true/false)")
    val hasDamage = readln().toBoolean()

    println("Введите текущее количество экпипажа:")
    val teamCount = readln().toIntOrNull() ?: 0

    println("Введите количество ящиков с провизией:")
    val provisionBox = readln().toIntOrNull() ?: 0

    println("Погода благоприятная? (true/false)")
    val goodWeather = readln().toBoolean()

    val canSail = (!hasDamage && teamCount in MIN_TEAM..MAX_TEAM && provisionBox > MIN_PROVISION_BOX) ||
                (hasDamage && teamCount == MAX_TEAM && goodWeather && provisionBox >= MIN_PROVISION_BOX)

    println("Корабль может отправиться в плавание? $canSail")
}