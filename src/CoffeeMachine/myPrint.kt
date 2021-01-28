package CoffeeMachine

import java.util.*

open class myPrint(list1: List<CofeType>, val ques: String) {

    fun ChooseCoffe(list1: List<CofeType>, s: String): Int {

        var answer: Int = 0
        while (answer < 1 || answer > 4) {
            for (el in list1) {
                println("${el}  ----->  ${list1.indexOf(el) + 1}")
            }
            print(ques)
            answer = Scanner(System.`in`).nextInt()

        }
        return answer
    }

    companion object {

    }

    init{
        ChooseCoffe(list1, ques)
    }
}

