package NewCoffee.Coffee

import NewCoffee.Coffee.Ingredients.Milk
import NewCoffee.Coffee.Ingredients.Sugar

class Latte(
        private val sugar: Sugar,
        private val milk: Milk,
) : Coffee {


    override fun price(): Double {
        return BASE_PRICE + sugar.price() + milk.price()
    }

    override fun toString(): String {
        return "coffee.Cappuccino: with $sugar and $milk"
    }

    companion object {
        private const val BASE_PRICE = 1.7
    }

}
