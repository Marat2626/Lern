package org.example.lesson_4

fun main () {

    val bookedTableToday = 13
    val bookedTableTomorrow = 9;

    val tableToday = (bookedTableToday  < TABLE_IN_RESTOURAN)
    val tableTomorrow = (bookedTableTomorrow < TABLE_IN_RESTOURAN )

    println("""
        Доступность столиков на сегодня: $tableToday
        Доступность столиков на сегодня: $tableTomorrow
    """.trimIndent())
}
const val TABLE_IN_RESTOURAN = 13