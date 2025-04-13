package lesson_1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println("Год полета $year")
    println("Вылет в " + String.format("%02d:%02d", hour, minute))
// вывод с нулем посмотрел в интернете
    hour = 10
    minute  = 55

    println("Прилет в " + String.format("%02d:%02d", hour, minute))

}