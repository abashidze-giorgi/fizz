package CoffeeMachine

class Cappucino (){

    fun price(): Double{
        val pricePerCup: Double = 2.0

        println("Cappuchino:")
        println("One dose - ${pricePerCup} $")
        return pricePerCup
    }
    init {
        price()
    }
}