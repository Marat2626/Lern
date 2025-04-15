package org.example.lesson_3

fun main() {

    val from = "D2"
    val tol = "D4"
    val moveNumber = 0

    println("$from:$tol,$moveNumber ход")

    println("""
         |$moveNumber ход сделан из кледки $from
        |в кледку $tol 
    """.trimMargin())
}