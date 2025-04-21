package org.example.lesson_5

fun main() {

    println("Какое расстояние поездки (в километрах)")
    val distanceTrip = readln().toFloat()

    println("Сколько топлива расходуется на 100 км (в литрах)")
    val fuelConsumption = readln().toFloat()

    println("Какая цена топлива за один литр ")
    val priceConsumptionOneLiter = readln().toDouble()

    val consumptionTrio = (distanceTrip * fuelConsumption) / hingret
    println("%.2f литров топлива понадобится на поездку".format(consumptionTrio))

    val priceConsump = consumptionTrio * priceConsumptionOneLiter
    println("%.2f стоимость топлива за поездку".format(priceConsump))
}
const val hingret = 100