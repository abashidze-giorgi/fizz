package NewCoffee.Coffee

import NewCoffee.Coffee.Ingredients.Milk
import NewCoffee.Coffee.Ingredients.Sugar


class Cappuccino(
        private val sugar: Sugar,
        private val milk: Milk,
        private val hasCinnamon: Boolean
): Coffee {

    private val cinnamonPrice: Double get() = if (hasCinnamon) 0.5 else 0.0

    override fun price(): Double {
        return BASE_PRICE + cinnamonPrice + sugar.price() + milk.price()
    }

    override fun toString(): String {
        return "Coffee.Cappuccino: with $sugar and $milk"
    }

    companion object{
        private const val BASE_PRICE = 2.0
    }
}