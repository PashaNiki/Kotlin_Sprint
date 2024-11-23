package org.example

const val DEGREE = "°C"

class WeatherDay {

    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var hasPrecipitation: Boolean = false

    fun printWeatherInfo() {
        val pricipitationInfo = if (hasPrecipitation) "Осадки: есть" else "Осадки: нет"
        println("Дневная температура: $dayTemperature$DEGREE")
        println("Ночная температура: $nightTemperature$DEGREE")
        println(pricipitationInfo)
    }
}

fun main() {

    val day1 = WeatherDay()
    day1.dayTemperature = 25
    day1.nightTemperature = 15
    day1.hasPrecipitation = true

    val day2 = WeatherDay()
    day2.dayTemperature = 30
    day2.nightTemperature = 15
    day2.hasPrecipitation = true

    println("Погода за первый день:")
    day1.printWeatherInfo()
    println()

    println("Погода за второй день:")
    day2.printWeatherInfo()

}