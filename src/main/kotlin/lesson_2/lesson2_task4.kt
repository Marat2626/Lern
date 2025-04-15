package org.example.lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11

    var baff = crystalOre * BONUS / PERCENTAGE_CALCULETION
    println("Дополнительная кристаллическая руда с помощью baff $baff")

    baff = ironOre * BONUS / PERCENTAGE_CALCULETION
    println("Дополнительная железная руда с помощью baff $baff")
}
const val BONUS = 20
const val PERCENTAGE_CALCULETION = 100