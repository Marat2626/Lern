package org.example.lesson_4

fun main () {

    val wether = "Солнечная"
    val tent = "Открыт"
    val air = 20
    val season = "Зима"

    val conditions = (wether == WETHER_SUNNY) && (tent == TENT) &&
            (air == AIR_HUMIDITY) && (season == CURRENT_YEAR)
    println("Благоприятные ли условия сейчас для роста бобовых =? $conditions")
}
const val WETHER_SUNNY = "Солнечная"
const val TENT = "Открыт"
const val AIR_HUMIDITY = 20
const val CURRENT_YEAR = "не зима"