package CoffeeMachine

import java.util.*

fun Answer(question: String):Boolean {
    var bool: Boolean = false
    var answer: String = ""
    while (answer != "y" || answer != "n") {
        answer = Scanner(System.`in`).toString().toLowerCase()
        if (answer == "y") bool = true
    }

    print("${question}? 'y', 'n'")
    return bool
}