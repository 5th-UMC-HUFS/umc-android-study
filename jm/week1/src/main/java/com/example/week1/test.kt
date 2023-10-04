package com.example.week1

fun main() {
    var input = readLine()!!.split(" ")
    var A = input[0].toInt()
    var B = input[1].toInt()

    println(A+B)
    println(A-B)
    println(A*B)
    println(A/B)
    println(A%B)
}