package lesson_1

fun main() {

    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println("Год полета $year")
    println("Вылет в ${"%02d:%02d".format( hour, minute)}")

    hour = 10
    minute  = 55

    println("Прилет в ${"%02d:%02d".format( hour, minute)}")
}