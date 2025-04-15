package org.example.lesson_3

fun main() {

    var name = """
            |Андреева
         |Татьяна
       |Сергеевна
    """.trimMargin()
    var age = 20

    println("$name $age лет")

    name = """
            |Андреева
         |Татьяна
       |Сидорова
    """.trimMargin()
    age = 22

    println("Данные после брака")
    println("$name $age лет")
}