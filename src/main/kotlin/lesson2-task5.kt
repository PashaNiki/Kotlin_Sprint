package org.example

fun main() {
    val initialAmount: Double  = 70000.toDouble()
    val interestRate: Double = 16.7
    val years: Int = 20
    val percentDivider: Double = 100.toDouble()

    val finalAmount = initialAmount * Math.pow(1 + interestRate / percentDivider, years.toDouble())

    println("Размер вклада через $years лет : %.3f".format(finalAmount))
}