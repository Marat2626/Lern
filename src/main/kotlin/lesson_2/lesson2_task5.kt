package org.example.lesson_2

fun main() {

    val initialSum = 70000
    var percentageRate = 16.7
    val numberOfPayments = 1

    percentageRate = percentageRate / 100

    val finalSum = initialSum * Math.pow((1 + percentageRate / numberOfPayments),(numberOfPayments * YEAR.toDouble()) )
    println(String.format("%.3f",finalSum))
}
const val YEAR = 20