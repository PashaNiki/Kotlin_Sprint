package org.example

const val DEGREE = "°C"
const val KELVIN_TO_CELSIUS = 273

class WeatherReport(
    val dayTemperatureKelvin: Int,
    val nightTemperatureKelvin: Int,
    val hasPrecipitation: Boolean
) {

    val dayTemperatureC: Int
        get() = dayTemperatureKelvin - KELVIN_TO_CELSIUS
    val nightTemperatureC: Int
        get() = nightTemperatureKelvin - KELVIN_TO_CELSIUS

    init {
        printWeatherInfo()
    }

    fun printWeatherInfo() {
        val precipitationInfo = if (hasPrecipitation) "Осадки: есть" else "Осадки: нет"
        println("Дневная температура: $dayTemperatureC$DEGREE")
        println("Ночная температруа: $nightTemperatureC$DEGREE")
        println(precipitationInfo)
    }
}

fun main() {
    val weatherToday = WeatherReport(
        dayTemperatureKelvin = 303,
        nightTemperatureKelvin = 293,
        hasPrecipitation = false
    )
}