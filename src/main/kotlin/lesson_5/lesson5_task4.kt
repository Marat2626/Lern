package org.example.lesson_5

import kotlin.math.pow

fun main() {
    println("Введите рост")
    var growth = readlnOrNull()?.toFloatOrNull()
    println("Введите вес")
    val weight = readlnOrNull()?.toDoubleOrNull()

    if (growth == null || weight == null || growth <= 0 || weight <= 0) {
        println("Пожалуйста, введите положительные числа для роста и веса.")
        return
    }

    growth = growth / 100
    val bmi = weight / (growth.pow(2))

    val category = when {
        bmi < 18.5 -> " Недостаточная масса тела"
        bmi in 18.5..25.0 -> " Нормальная масса тела"
        bmi in 25.0..30.0 -> " Избыточная масса тела"
        else -> " Ожирение"
    }
    println("Ваш ИМТ: %.2f" .format(bmi) + category)
}