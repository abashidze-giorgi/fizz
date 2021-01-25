package CoffeeMachine

import java.util.*

open class myPrint(list1: List<CofeType>, val ques1: String) {

    fun ChooseCoffe(list1: List<CofeType>): Int {

        var answer: Int = 0
        while (answer < 1 || answer > 4) {
            for (el in list1) {
                println("${el}  ----->  ${list1.indexOf(el) + 1}")
            }
            print(ques1)
            answer = Scanner(System.`in`).nextInt()

        }
        return answer
    }

    companion object {

    }
}

