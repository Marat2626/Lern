package org.example.lesson_3

fun main() {

    var from = "E2"
    var tol = "E4"
    var moveNumber = 1

    println("$from:$tol ход $moveNumber")

    from = "D2"
    tol = "D3"

    println("$from:$tol ход ${moveNumber + 1}")
}