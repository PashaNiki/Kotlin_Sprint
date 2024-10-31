package org.example

const val MIN_PASSWORD_LENGTH = 6

fun main() {

    println("Введите длину пароля (миниум $MIN_PASSWORD_LENGTH символов):")
    val passwordLength = readln().toIntOrNull() ?: MIN_PASSWORD_LENGTH

    if (passwordLength < MIN_PASSWORD_LENGTH) {
        println("Ошибка : Минимальная длинна пароля $MIN_PASSWORD_LENGTH символов")
        return
    }
    val digits = ('0'..'9')
    val lowCaseLetters = ('a'..'z')
    val upperCaseLetters = ('A'..'Z')

    val passwordChar = mutableListOf<Char>()
    passwordChar.add(digits.random())
    passwordChar.add(lowCaseLetters.random())
    passwordChar.add(upperCaseLetters.random())

    val remainingChars = passwordLength - passwordChar.size

    val allChars = digits + lowCaseLetters + upperCaseLetters
    for (i in 1..remainingChars) {
        passwordChar.add(allChars.random())
    }
    passwordChar.shuffle()

    val password = passwordChar.joinToString("")
    println("Сгенерированный пароль : $password")
}