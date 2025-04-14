package org.example.lesson_2

fun main() {
    val pointMarat = 3
    val pointLera = 5
    val pointMax = 3
    val pointMasha = 4

    val averagePoint = (pointMasha + pointMax + pointLera + pointMarat) / NUMBER_OF_STUDENTS.toDouble()
    println("Средний балл учеников $averagePoint")

}
const val NUMBER_OF_STUDENTS = 4