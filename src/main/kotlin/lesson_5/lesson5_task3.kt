package org.example.lesson_5

fun main() {

    val numberOne = 2
    val numberTwo = 20

    val input = readln().toInt()
    val inputTwo = readln().toInt()

    if (input or inputTwo in 0..42){

        if ((input == numberOne && inputTwo == numberTwo) || (input == numberTwo && inputTwo == numberOne)) {
            println("выйграл")
        }
        else if (((input == numberOne || input == numberTwo) && (inputTwo !== numberTwo && inputTwo !== numberOne)) || ((input !== numberOne && input !== numberTwo) && (inputTwo == numberOne || inputTwo == numberTwo))){
            println("утешиетльный")
        }
        else if ((input !== numberOne && input !== numberTwo) || (inputTwo !== numberOne && inputTwo !== numberTwo)) {

            println("Не угадал")
        }
    }
    else {
        println("Число должно быть от 0 до 42")
    }

}
