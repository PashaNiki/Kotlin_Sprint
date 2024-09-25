package org.example

fun main(){

    val employee = 50
    val intern = 30
    val employeeSalary = 30000
    val internSalary = 20000

    val paymentEmployee = employee * employeeSalary
    println(paymentEmployee)

    val middlePaymentOfEmployee = paymentEmployee + (intern * internSalary)
    println(middlePaymentOfEmployee)

    val middlePaymentOfPeople = employee + intern
    val averageSalaryPeople = middlePaymentOfEmployee / middlePaymentOfPeople
    println(averageSalaryPeople)
}