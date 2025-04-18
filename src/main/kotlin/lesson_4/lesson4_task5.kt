package org.example.lesson_4

fun main() {

    val damageBody = true
    val numberCrew = 70
    val numberBox = 50
    val wether = true

    val ship = ((damageBody == true) && (numberCrew in MIN_CREW..MAX_CREW) && (numberBox > MIN_BOX) && (wether == true)) ||
            ((numberCrew == MAX_CREW) && (wether == true) && (numberBox >= MIN_BOX ))

    println("Может ли корабль отправиться в плавание $ship")
}
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_BOX = 50