package org.example.lesson_6

fun main() {

    val myNum = 32

    println("Угодай мое число")
    try {
        do {
            val num = readln().toInt()

            when {
                num > myNum -> println("У меня меньше число")
                num < myNum -> println("У меня больше число")
                else -> println("Угадал")
            }

        } while(num != myNum)
    } catch (e: NumberFormatException) {
        println("Ошибка ввода")
    }

}