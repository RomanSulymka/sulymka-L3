package com.example.task3

import kotlin.random.Random

fun main() {
    val array = HashMap<Int, String>()
    for (i in 0..10) {
        var number: Int
        do {
            number = Random.nextInt(0, 100)
        } while (array.containsKey(number))
        array[number] = "value$number"
    }

    val sort = array.toSortedMap()

    println(array.keys)
    println(sort.keys)
}