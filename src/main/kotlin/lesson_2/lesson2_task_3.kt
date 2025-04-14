package org.example.lesson_2

fun main() {

    val departureTimeHours = 9
    val departureTimeMinutes = 39

    println("Время отправления ${"%02d:%02d".format(departureTimeHours,departureTimeMinutes)}")

    var pathInMinutes = 457
    val minutesInHours = pathInMinutes / MINUTESINHOURS
    pathInMinutes = pathInMinutes % MINUTESINHOURS

    println("Время прибытия ${"%02d:%02d".format(minutesInHours,pathInMinutes)}")
}
const val MINUTESINHOURS = 60