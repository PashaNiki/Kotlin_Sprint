package org.example

const val DEGREE = "°C"

class WeatherData(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val hasPrecipitation: Boolean
) {

    fun printWeatherInfo() {
        val pricipitationInfo = if (hasPrecipitation) "Осадки: есть" else "Осадки: нет"
        println("Дневная температура: $dayTemperature$DEGREE")
        println("Ночная температура: $nightTemperature$DEGREE")
        println(pricipitationInfo)
    }
}

fun main() {

    val weatherToday = WeatherData(
        dayTemperature = 28,
        nightTemperature = 18,
        hasPrecipitation = false
    )

    println("Погода на сегодня:")
    weatherToday.printWeatherInfo()

}