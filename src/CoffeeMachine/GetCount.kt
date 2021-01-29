package CoffeeMachine

import java.util.*


abstract class GetCount() {

    open fun GetItemCount() : Double{
        print("Count? :")
        while (!Scanner(System.`in`).hasNextDouble()) {
            answer =  Scanner(System.`in`).nextDouble()
        }
        return answer
    }

    companion object{
        var answer: Double = 0.0
    }
}
