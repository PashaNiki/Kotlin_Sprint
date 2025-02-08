package org.example

import java.time.LocalDateTime

const val ALPHA_CENTAURI_DISTANCE = 4.37

data class GalacticGuide(
    val name: String,
    val description: String,
    val eventDateTime: LocalDateTime,
    val distanceFromEarth: Double
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Ближайшая звёздная система к Солнцу",
        eventDateTime = LocalDateTime.of(2150, 5, 27, 14, 0),
        distanceFromEarth = ALPHA_CENTAURI_DISTANCE
    )

    val (name, description, eventDataTime, distance) = alphaCentauri

    println("Название: $name")
    println("Описание: $description")
    println("Дата события: $eventDataTime")
    println("Рассояние от Замли: $distance световых лет")
}