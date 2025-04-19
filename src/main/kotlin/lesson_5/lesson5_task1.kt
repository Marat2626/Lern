package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val numberOne = Random.nextInt(1, 100)
    val numberTwo = Random.nextInt(1, 100)

    val sum = numberOne + numberTwo

    println("Пройдите проверку $numberOne + $numberTwo")
    println("Ваш ответ")

    val number = readln().toInt()

    if (number == sum) {
        println("Доступ разрешен")
    } else {
        println("Доступ запрещен")
    }
}