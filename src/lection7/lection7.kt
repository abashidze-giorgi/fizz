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
    val personA = Person("MyName", 30)

    val personB = personA.copy(age = 25)
}

fun String.checkString(): Boolean {

    return this.length > 0
}

fun <Int> MutableList<Int>.changeIndex(num1: Int, num2: Int) {
    var num1 = num1
    var num2 = num2
    var temp: Int = num1
    fun change() {
        num1 = num2
        num2 = temp
    }
}

data class Person1(var name: String, var age: Int) {
    fun person(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

data class Person(var name: String, var age: Int) {

    fun Person(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}
