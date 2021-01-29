package CoffeeMachine

import java.util.*
open class Request() {


    fun Answer(question: String): Boolean {
        var bool: Boolean = false

        val question = question
        var answer: String = ""
        while (answer != "y" || answer != "n") {
            println(answer)
            answer = Scanner(System.`in`).toString().toLowerCase()
            if (answer == "y") bool = true
        }

        print("${question}? 'y', 'n'")
        return bool
    }
}