package org.example.lesson_6

fun main() {

    val myNum = 32

    try {
        do {
            val num = readln().toInt()

            when {
                num > myNum -> println("Меньше")
                num < myNum -> println("Больше")
                else -> println("Угадал")
            }

        } while(num != myNum)
    } catch (e: NumberFormatException) {
        println("Ошибка ввода")
    }

}