package com.kotlinplayground.basics

fun main() {
    //if-else
    //when

    var name = "Alex"
    //name = "Chloe"

    val result = if(name.length == 4) {
        println("Name is Four Characters")
        name.length
    } else {
        println("Name is not Four Characters")
        name.length
    }

    println("result: $result")

    //1 -> GOLD, 2-> SILVER, 3-> BRONZE

    val position = 1

    val medal = if (position == 1) "GOLD"
    else if (position == 2) {
        "SILVER"
    } else if (position == 3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }

    println(medal)

    val medal2 = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"

    }
    println(medal2)
}