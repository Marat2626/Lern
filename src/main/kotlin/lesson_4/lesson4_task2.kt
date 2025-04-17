package org.example.lesson_4

fun main () {
    var weight = 20
    var volum = 80

    println(("Груз с весом $weight кг и объемом $volum л соответствует категории Average " +
            "${(weight > WEIGHT_START && weight <= WEIGHT_FINISH) && (volum < MAX_VOLUM)}"))

    weight = 50
    volum = 100

    println(("Груз с весом $weight кг и объемом $volum л соответствует категории Average " +
            "${(weight > WEIGHT_START && weight < WEIGHT_FINISH) && (volum < MAX_VOLUM)}"))

}
const val WEIGHT_START = 35
const val WEIGHT_FINISH = 100
const val MAX_VOLUM = 100