package org.example.lesson_2

fun main() {

    val mainEmployees = 50
    val stadingEmployees = 30

    val salaryMainEmployees =  mainEmployees * SALARY_MAIN
    println("Зарплата основных работников $salaryMainEmployees")

    val mainSalary = salaryMainEmployees + (stadingEmployees * SALARY_STADING)
    println("Зарплата всех работников $mainSalary")

    val averageSalaryOfOneEmployee = (salaryMainEmployees + (stadingEmployees * SALARY_STADING)) /
            (mainEmployees + stadingEmployees)
    println("Средняя зарплата всех работников $averageSalaryOfOneEmployee")

}
const val SALARY_MAIN = 30000
const val SALARY_STADING = 20000