package com.kotlinplayground.basics

fun main() {

    val name = "Sergio"
    println(name)

    //name = "Sergio1"

    var age = 34
    println(age)
    age = 35
    println(age)

    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"
    println("course : $course an the course length is ${course.length}")

    val multiLine = "ABC \n DEF"
    println(multiLine)

    val multiLine1 = """
        ABC
        DEF
    """.trimIndent()

    println(multiLine1)
}