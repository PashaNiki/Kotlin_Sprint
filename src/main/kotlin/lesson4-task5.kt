package org.example

    const val MIN_TEAM = 55
    const val MAX_TEAM = 70
    const val MIN_PROVISION_BOX = 50


fun main() {

    println("Корабль имеет повреждения? (true/false)")
    val hasDamage = readLine()!!.toBoolean()

    println("Введите текущее количество экпипажа:")
    val teamCount = readLine()!!.toInt()

    println("Введите количество ящиков с провизией:")
    val provisionBox = readLine()!!.toInt()

    println("Погода благоприятная? (true/false)")
    val goodWeather = readLine()!!.toBoolean()

    val canSail = (!hasDamage && teamCount in MIN_TEAM..MAX_TEAM && provisionBox > MIN_PROVISION_BOX) ||
                (hasDamage && teamCount == MAX_TEAM && goodWeather && provisionBox >= MIN_PROVISION_BOX)

    println("Корабль может отправиться в плавание? $canSail")
}