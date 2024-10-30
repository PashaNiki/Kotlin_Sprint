package org.example

fun main() {

    println("Введите длину пароля (миниум 6 символов):")
    val passwordLength = readln().toIntOrNull() ?: 6

    if (passwordLength < 6) {
        println("Ошибка : Минимальная длинна пароля 6 символов")
        return
    }
    val digits = ('0'..'9')
    val lowCaseLetters = ('a'..'z')
    val upperCaseLetters = ('A'..'Z')

    val passwordChar = mutableListOf<Char>()
    passwordChar.add(digits.random())
    passwordChar.add(lowCaseLetters.random())
    passwordChar.add(upperCaseLetters.random())

    val allChars = digits + lowCaseLetters + upperCaseLetters
    for (i in 4..passwordLength) {
        passwordChar.add(allChars.random())
    }
    passwordChar.shuffle()

    val password = passwordChar.joinToString("")
    println("Сгенерированный пароль : $password")
}