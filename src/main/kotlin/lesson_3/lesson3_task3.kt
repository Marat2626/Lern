package org.example.lesson_3

fun main() {

    val namber = 5
    val multiplication = """
        |Таблица умножения на $namber
        |$namber * 1 = ${namber * 1}
          |$namber * 2 = ${namber * 2}
        |$namber * 3 = ${namber * 3}
          |$namber * 4 = ${namber * 4}
        |$namber * 5 = ${namber * 5}
          |$namber * 6 = ${namber * 6}
        |$namber * 7 = ${namber * 7}
          |$namber * 8 = ${namber * 8}
        |$namber * 9 = ${namber * 9}
        """.trimMargin()
    println(multiplication)
}