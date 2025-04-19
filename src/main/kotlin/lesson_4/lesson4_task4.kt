package org.example.lesson_4

fun main() {

    val day = 5
    val  isEven = (day % 2 == 0)

    val armsAndAbs = !isEven
    val legsAndBack = isEven

    println("""
        Упражнение для рук $armsAndAbs
        Упражнение для ног $legsAndBack
        Упражнение для спины $legsAndBack
        Упражнение для пресса $armsAndAbs
    """.trimIndent() )
}