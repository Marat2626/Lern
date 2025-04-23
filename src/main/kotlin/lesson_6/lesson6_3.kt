package org.example.lesson_6

fun main() {

    var count = 0
    do {
        count++
        val numberOne = (0..5).random()
        val numberTwo = (0..5).random()
        Thread.sleep(1000)

        println("$count бросок двух костей $numberOne $numberTwo ")

        if ((numberOne == NUMBER_ONE && numberTwo == NUMBER_TWO) || (numberOne == NUMBER_TWO && numberTwo == NUMBER_ONE)){
            println("Кости $numberOne и $numberTwo равны моим числам")
            break
        }
    }while (true)
}
const val NUMBER_ONE = 3
const val NUMBER_TWO = 4