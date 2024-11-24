package org.example

import kotlin.random.Random

const val DEGREE = "°C"
const val KELVIN_TO_CELSIUS = 273
const val DAY_TEMP_MIN_KELVIN = 273
const val DAY_TEMP_MAX_KELVIN = 313
const val NIGHT_TEMP_MIN_KELVIN = 263
const val NIGHT_TEMP_MAX_KELVIN = 303


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
    val  monthWeather = mutableListOf<WeatherReport>()

    repeat(30) {
        val dayTempKelvin = Random.nextInt(DAY_TEMP_MIN_KELVIN, DAY_TEMP_MAX_KELVIN)
        val nightTempKelvin = Random.nextInt(NIGHT_TEMP_MIN_KELVIN, NIGHT_TEMP_MAX_KELVIN)
        val precipitation = Random.nextBoolean()
        monthWeather.add(WeatherReport(dayTempKelvin, nightTempKelvin, precipitation))
    }

    val dayTemperatures = monthWeather.map { it.dayTemperatureC }
    val nightTemperatures = monthWeather.map { it.nightTemperatureC }

    val averageDayTemp = dayTemperatures.average()
    val averageNightTemp = nightTemperatures.average()

    val daysWithPrecipitation = monthWeather.count { it.hasPrecipitation }

    println("Средняя дневная температура: %.2f$DEGREE".format(averageDayTemp))
    println("Средняя ночная температура: %.2f$DEGREE".format(averageNightTemp))
    println("Количество дней с осадками: $daysWithPrecipitation из 30")
}