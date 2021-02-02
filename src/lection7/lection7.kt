package lection7

import MyGame.units.Enemy

class lection7 {
}


fun <T : Enemy> filterEnemies(enemies: List<T>): List<T> {
    val enemyList = enemies
    return enemyList
}

fun <T : Double> sum(first: T, second: T): Double {
    return first + second
}

fun <T : Number> multiplication(first: T, second: T): Double {
    val x = first.toDouble()
    val y = second.toDouble()
    return (x * y)
}


fun <T : List<Number>> multi1(list: T): Double {
    var firstNum: Double = 1.0
    for (el in list) {
        val newel = el.toDouble()
        firstNum *= newel
    }
    return firstNum
}

fun <T : Comparable<T>> max(x: T, y: T): T {
    return if (x > y) x else y
}


fun main() {
    max<String>("2", "3")
}