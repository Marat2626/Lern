package org.example.lesson_1

fun main() {

    val totalSeconds: Int = 4000

    val hours = totalSeconds / SECONDS_IN_HOUR
    val minutes = (totalSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val seconds = (totalSeconds % SECONDS_IN_HOUR) % SECONDS_IN_MINUTE

    println("%02d:%02d:%02d".format( hours, minutes, seconds))
}

const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = 3600