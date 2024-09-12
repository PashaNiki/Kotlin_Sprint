package org.example.lesson_1

fun main() {
    // год полета Юрия должна задаваться через val - не меняем данные
    val year = 1961

    // переменные времени, должны задаваться через var - меняем данные
    var hour = 10
    var minute = 55

    // выводим год, час и минуту взлета по одной переменной на каждую строку
    println(year)
    println(hour)
    println(minute)

    // выведим время посадки в одной строке, тут пришлость поисктаь про формат записии
    print(String.format("%02d:%02d", hour, minute))

}