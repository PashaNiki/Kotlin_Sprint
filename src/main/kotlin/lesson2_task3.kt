package org.example

fun main(){
    var minutesInHour = 60
    var hoursInDay = 24
    var departureHour = 9
    var departureMinute = 39
    var timeInWay = 475

    var departureMinutes = departureHour * minutesInHour + departureMinute
    var allMinitesInTrain = departureMinutes + timeInWay

    var arivalHour = (departureMinutes / minutesInHour) % hoursInDay
    var arivalMinute = allMinitesInTrain / minutesInHour
    println(String.format("%02d:%02d", arivalHour,arivalMinute))
}

