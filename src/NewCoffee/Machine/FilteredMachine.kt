package NewCoffee.Machine

import NewCoffee.Coffee.Coffee
import NewCoffee.Coffee.Filtered
import NewCoffee.Coffee.Ingredients.Sugar
import java.util.*

class FilteredMachine(scanner: Scanner): CoffeeMachine(scanner) {

    override fun request(): Coffee {
        println("Please Enter Coffee Type(Available Types: $FILTERED)")

        return when (val input = scanner.next()) {
            FILTERED -> Filtered(requestStrengthCount(), Sugar(requestSugar()))
            else -> throw InvalidCoffeeTypeException(
                    input,
                    arrayOf(FILTERED)
            )
        }
    }

    private fun requestStrengthCount(): Int {
        print("Please Enter Strength (From 1 to 5): ")
        return when (val strength = scanner.nextInt()) {
            in 1..5 -> strength
            else -> error("Invalid Strength")
        }
    }

    companion object {
        private const val FILTERED = "filtered"
    }
}