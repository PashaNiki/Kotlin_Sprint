package org.example

const val DEFAULT_TEMPERATURE = 25.3
const val DEFAULT_PRECIPITATION = 12.5

abstract class WeatherStationStats {
    abstract fun getData(): String
}

class Temperature(val value: Double) : WeatherStationStats () {
    override fun getData(): String {
        return "Температура: $value°C"
    }
}

class PrecipitationAmount(val value: Double) : WeatherStationStats (){
    override fun getData(): String {
        return "Осадки: $value мм"
    }
}

class WeatherServer {
    fun sendToServer(stat: WeatherStationStats) {
        println("Отправка данных на сервер")
        println(stat.getData())
    }
}

fun main () {
    val temperature = Temperature(DEFAULT_TEMPERATURE)
    val precipitation = PrecipitationAmount(DEFAULT_PRECIPITATION)

    val server = WeatherServer()

    server.sendToServer(temperature)
    server.sendToServer(precipitation)
}
