package com.kotlinplayground.basics

fun main () {

    val range = 1..10
    for (i in range) {
        println("i : $i")
    }

    val reverseRange = 10downTo 1
    for(i in reverseRange) {
        println("reverseRange : $i")
    }
}