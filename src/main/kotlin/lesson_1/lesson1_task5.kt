package org.example.lesson_1

fun main(){

    val totalSeconds: Int = 4000

    val hours = totalSeconds / SECONDS_IN_HOUR
    val minute = (totalSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val seconds = (totalSeconds % SECONDS_IN_HOUR) % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours,minute,seconds))
}
const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = 3600






