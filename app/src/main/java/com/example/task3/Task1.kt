package com.example.task3

fun findMostRepeat(list: List<Int>): Int? {
    val map: MutableMap<Int, Int> = mutableMapOf()
    list.forEach {
        if (map.containsKey(it)) map[it] = map.getValue(it) + 1
        else map[it] = 1
    }
    var mostRepeat: Int? = null
    var biggest = 0
    map.forEach { (i, j) ->
        if (j > biggest) {
            biggest = j
            mostRepeat = i
        }
    }

    return mostRepeat
}


fun main() {
    val array: List<Int> = mutableListOf(6, 8, 1, 4, 6, 4, 2, 3, 9, 8, 5, 1, 6)
    print(findMostRepeat(array))
}