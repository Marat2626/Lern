package org.example.lesson_5

fun main() {

    val ageYear = readln().toInt()

    if(ageYear <= yearNow ){
        println("Показать экран со скрытым контентом")
    }else {
        println("Доступ запрещен")
    }
}
const val yearNow = 2007