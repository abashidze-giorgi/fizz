package CoffeeMachine

import java.util.*


fun main() {
    println("Choose Coffee:")
    print("1 - Capuchinno,")
    print("2 - Late: ")
    val coffee =  Scanner(System. `in`).nextInt()
    print("how many cups: - ")
    val coffeeCount =  Scanner(System. `in`).nextDouble()
    if(coffee == 1){
        val isSugar =  Answer("Sugar")

        val isMilk =  Answer("Milk")

        val isCinnamon =  Answer("Cinnamon")

        val as1 = Main().getCoffee(1, coffeeCount, isSugar, isMilk, isCinnamon)
    }else{
        val isSugar =  Answer("Sugar")
        val as1 = Main().getCoffee(coffee, coffeeCount, isSugar, false, false)
    }
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