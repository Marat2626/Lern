package org.example.lesson_3

fun main() {

    var name = "Татьяна"
    var surename = "Андреева"
    var patronymic = "Сергеевна"
    var age = 20

    println("$name $surename $patronymic возраст $age")

    surename = "Сидорова"
    age = 22

    println("Данные после брака")
    println("$name $surename $patronymic возраст $age")
}