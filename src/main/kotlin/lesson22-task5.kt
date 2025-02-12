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

    println("Название: ${alphaCentauri.component1()}")
    println("Описание: ${alphaCentauri.component2()}")
    println("Дата события: ${alphaCentauri.component3()}")
    println("Рассояние от Замли: ${alphaCentauri.component4()} световых лет")
}