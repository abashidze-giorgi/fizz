package NewCoffee.Machine

import NewCoffee.Coffee.Cappuccino
import NewCoffee.Coffee.Coffee
import NewCoffee.Coffee.Ingredients.Milk
import NewCoffee.Coffee.Ingredients.Sugar
import NewCoffee.Coffee.Latte
import java.util.*

class EspressoMachine(
        scanner: Scanner
) : CoffeeMachine(scanner) {


    override fun request(): Coffee {
        println("Please Enter Coffee Type(Available Types: $LATTE, $CAPPUCCINO)")
        return when (val input = scanner.next()) {
            LATTE -> Latte(Sugar(requestSugar()), Milk(requestMilk()))
            CAPPUCCINO -> Cappuccino(Sugar(requestSugar()), Milk(requestMilk()), hasCinnamon())
            else -> throw InvalidCoffeeTypeException(
                    input, arrayOf(LATTE, CAPPUCCINO)
            )
        }
    }

    private fun hasCinnamon(): Boolean {
        print("Do you want cinnamon: ")
        return scanner.nextBoolean()
    }

    private fun requestMilk(): Int {
        print("Please Enter Milk Quantity : ")
        return when (val sugar = scanner.nextInt()) {
            in Int.MIN_VALUE..0 -> 0
            else -> sugar
        }
    }

    companion object {
        private const val LATTE = "latte"
        private const val CAPPUCCINO = "cappuccino"
    }


}