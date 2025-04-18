package org.example.lesson_4

fun main() {

    val day = 5

    val armsAndAbs = (day % 2 != 0)
    val legsAndBack = (day % 2 == 0)

    println("""
        Упражнение для рук $armsAndAbs
        Упражнение для ног $legsAndBack
        Упражнение для спины $legsAndBack
        Упражнение для пресса $armsAndAbs
    """.trimIndent() )
}