package org.example

    const val ALL_TABLES = 13

fun main () {

    val bookingTabledToday = ALL_TABLES
    val bookingTabledTomorrow = 9

    val availableToday = bookingTabledToday < ALL_TABLES
    val availableTomorrow = bookingTabledTomorrow < ALL_TABLES

    println("Доступность столиков на сегодня: $availableToday\nДоступность столиков на завтра: $availableTomorrow")

}