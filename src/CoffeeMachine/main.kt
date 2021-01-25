package CoffeeMachine

import java.util.*


fun main() {
}


class Main() {

    fun getCoffee(coffeeType: Int, coffeeCount: Double, isSugar: Boolean, isMilk: Boolean, isCinnamon: Boolean){
        if(coffeeType == 1){
            val i = Capuchinno().getPrice(coffeeCount, isMilk, isSugar, isCinnamon)
        }else{
            val i = Late().getPrice(coffeeCount, isSugar)
        }
    }
}