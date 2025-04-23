package org.example.lesson_6

fun main() {

    var num = readln().toInt()
    var factorial: Long = 1
    var k = 1

    while (k <= num){

       factorial *= k
        k++
    }
    println(factorial)
}